package sn.isi.service;

import sn.isi.entities.Employe;
import sn.isi.entities.Services;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeImp implements IEmploye{
    //private Scanner sc = new Scanner(System.in);
    Employe emp = new Employe();
    Services service = new Services();
    @Override
    public Employe saisie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Employe -------");
        System.out.println("");
        System.out.printf("Saisir l' id du Service: ");
        service.setId(Integer.parseInt(sc.nextLine()));
        System.out.printf("Saisir le nom du Service: ");
        service.setNom(sc.nextLine());
        System.out.printf("Entre l' id de l'employe: ");
        emp.setId(Integer.parseInt(sc.nextLine()));
        System.out.printf("Entre votre nom de l'employe: ");
        emp.setNom(sc.nextLine());
        System.out.printf("Entre votre prenom de l'employe: ");
        emp.setPrenom(sc.nextLine());
        System.out.printf("Entre votre email de l'employe: ");
        emp.setEmail(sc.nextLine());
        System.out.printf("Entre votre password de l'employe: ");
        emp.setPassword(sc.nextLine());
        System.out.println("Entre l'etat de l'employe: ");
        emp.setEtat(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre le service: ");
        emp.setService(service);

        return emp;
    }

    @Override
    public void afficher(Employe e) {
        System.out.println("------- Employe -------");
        System.out.println("");
        System.out.println("L' id du Service: "+service.getId());
        System.out.println("Le nom du Service: "+service.getNom());
        System.out.println("L' id de l'employe: "+emp.getId());
        System.out.println("Le nom de l'employe: "+emp.getNom());
        System.out.println("Le prenom de l'employe: "+emp.getPrenom());
        System.out.println("l'email de l'employe: "+emp.getEmail());
        System.out.println("Le password de l'employe: "+emp.getPassword());
        System.out.println("L'etat de l'employe: "+emp.getEtat());

    }
}
