package sn.isi.service;

import sn.isi.entities.Consultant;

import java.util.Scanner;

public class ConsultantImp implements IConsultant {
    private Scanner sc = new Scanner(System.in);
    Consultant c = new Consultant();

    @Override
    public Consultant saisie() {
        System.out.println("------- COnsultant -------");
        System.out.println("");
        System.out.printf("Entre l' id du Consultant: ");
        c.setId(Integer.parseInt(sc.nextLine()));
        System.out.printf("Entre le nom: ");
        c.setNom(sc.nextLine());
        System.out.printf("Entre le prenom: ");
        c.setPrenom(sc.nextLine());
        System.out.printf("Entre l'email: ");
        c.setEmail(sc.nextLine());
        System.out.printf("Entre votre password: ");
        c.setPassword(sc.nextLine());
        System.out.println("Entre l'etat: ");
        c.setEtat(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre le nombre d'heure: ");
        c.setNbHeure(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre le taux d'horaire: ");
        c.setTauxHoraire(Double.parseDouble(sc.nextLine()));
        return c;
    }

    @Override
    public void afficher(Consultant c) {
        System.out.println("------- COnsultant -------");
        System.out.println("");
        System.out.println("l'identifiant est : "+c.getId());
        System.out.println("le nom est : "+c.getNom());
        System.out.println("le prenom est : "+c.getPrenom());
        System.out.println("l' email est : "+c.getEmail());
        System.out.println("le password  est : "+c.getPassword());
        System.out.println("l'etat est : "+c.getEtat());
        System.out.println("le nombre d'heure est : "+c.getNbHeure());
        System.out.println("le taux horaire est : "+c.getTauxHoraire());
    }

}
