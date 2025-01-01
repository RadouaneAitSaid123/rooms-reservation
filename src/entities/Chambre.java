package entities;

public class Chambre {

    private int id;
    private String telephone;
    private Categorie categorie;
    private static int count = 0;

    public Chambre(String telephone, Categorie categorie) {
        this.id = ++count;
        this.telephone = telephone;
        this.categorie = categorie;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", telephone='" + telephone + '\'' +
                ", categorie=" + categorie +
                '}';
    }
}
