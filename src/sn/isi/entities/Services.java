package sn.isi.entities;

public class Services {
    private int id;
    private String nom;
    //Constructeurs sans argts
    public Services() {
    }

    //Constructeurs avec argts
    public Services(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
