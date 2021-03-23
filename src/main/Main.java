package main;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employe;
import sn.isi.service.ConsultantImp;
import sn.isi.service.EmployeImp;
import sn.isi.service.IConsultant;
import sn.isi.service.IEmploye;

public class Main {
    public static void main(String[] args) {
        //Employe
        IEmploye iemp = new EmployeImp();
        Employe e = iemp.saisie();
        iemp.afficher(e);

        //Consultant
        IConsultant icons = new ConsultantImp();
        Consultant consultant = icons.saisie();
        icons.afficher(consultant);
    }


}
