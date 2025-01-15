package service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entities.Reservation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class PDFGenerator {

    private ReservationService reservationService;

    public PDFGenerator() {
        this.reservationService = new ReservationService(); // Initialisez votre service
    }

    public void generateReservationsPDF(String filePath) {
        Document document = new Document();

        try {
            // Initialisation du PDF
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Titre du document
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Paragraph title = new Paragraph("Liste des Réservations", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(Chunk.NEWLINE); // Ligne vide pour l'espacement

            // Récupération des données
            List<Reservation> reservations = reservationService.findAll();

            // Création d'une table avec des colonnes (ID, Date début, Date fin, Client, Chambre, Statut)
            PdfPTable table = new PdfPTable(6); // 5 colonnes
            table.setWidthPercentage(100);
            table.setWidths(new float[]{1, 3, 3, 4, 3, 3}); // Largeur des colonnes

            // Ajout des en-têtes
            table.addCell("ID");
            table.addCell("Date Début");
            table.addCell("Date Fin");
            table.addCell("Client");
            table.addCell("Chambre");
            table.addCell("Statut");

            // Ajout des données
            for (Reservation reservation : reservations) {
                table.addCell(String.valueOf(reservation.getId()));
                table.addCell(reservation.getDateDebut().toString());
                table.addCell(reservation.getDateFin().toString());
                table.addCell(reservation.getClient().getPrenom() + " " + reservation.getClient().getNom());
                table.addCell(reservation.getChambre().getNumero());
                table.addCell(reservation.getStatus().toString());
            }

            // Ajout de la table au document
            document.add(table);

            System.out.println("PDF généré avec succès : " + filePath);

        } catch (DocumentException | IOException e) {
            System.out.println("Erreur lors de la génération du PDF : " + e.getMessage());
        } finally {
            document.close();
        }
    }
}
