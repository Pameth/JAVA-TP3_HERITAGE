package sn.isi.entities;

public class Employe extends Personne{
    private Services service; //attribut de type Service

    //Constructeurs sans argts
    public Employe() {
    }

    //Constructeurs avec argts
    public Employe(int id, String nom, String prenom, String email, String password, int etat, Services service) {
        super(id, nom, prenom, email, password, etat); //Englobe l'ensemble des attrib d'Employe
        this.service = service;
    }

    //Getters and Setters
    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
