package sn.isi.entities;

public class Consultant extends Personne{
    private int nbHeure;
    private double tauxHoraire;

    //Constructeurs sans argts
    public Consultant() {
    }

    //Constructeurs avec argts
    public Consultant(int id, String nom, String prenom, String email, String password, int etat, int nbHeure, double tauxHoraire) {
        super(id, nom, prenom, email, password, etat);
        this.nbHeure = nbHeure;
        this.tauxHoraire = tauxHoraire;
    }

    //Getters and setters
    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
