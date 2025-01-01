package entities;

import java.util.Date;

public class Reservation {

    private Date dateDebut;
    private Date dateFin;
    private Client client;
    private Chambre chambre;

    public Reservation(Date dateDebut, Date dateFin, Client client, Chambre chambre) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.chambre = chambre;
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

    @Override
    public String toString() {
        return "Reservation{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", client=" + client +
                ", chambre=" + chambre +
                '}';
    }
}
