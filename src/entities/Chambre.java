package entities;

public class Chambre {

    private int id;
    private String telephone;
    private String numero;
    private Categorie categorie;
    private static int count = 0;

    public Chambre(String numero, String telephone, Categorie categorie) {
        this.id = ++count;
        this.numero = numero;
        this.telephone = telephone;
        this.categorie = categorie;
    }
    
     public Chambre(int id, String numero, String telephone, Categorie categorie) {
        this.id = id;
        this.numero = numero;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Chambre{" + "id=" + id + ", numero=" + numero + ", telephone=" + telephone + ", categorie=" + categorie + '}';
    }

}
