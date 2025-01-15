package entities;

import java.util.Date;

public class Reservation {

    private int id;
    private Date dateDebut;
    private Date dateFin;
    private Client client;
    private Chambre chambre;
    private ReservationStatus status;
    private static int count = 0;

    public Reservation(Date dateDebut, Date dateFin, Client client, Chambre chambre, ReservationStatus status) {
        this.id = ++count;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.chambre = chambre;
        this.status = status;
    }

    public Reservation(int id, Date dateDebut, Date dateFin, Client client, Chambre chambre, ReservationStatus status) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.chambre = chambre;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{"
                + "dateDebut=" + dateDebut
                + ", dateFin=" + dateFin
                + ", client=" + client
                + ", chambre=" + chambre
                + '}';
    }
}
