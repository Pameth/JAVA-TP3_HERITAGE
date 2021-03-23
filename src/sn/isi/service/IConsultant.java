package sn.isi.service;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employe;

public interface IConsultant {

    public Consultant saisie();
    public void afficher(Consultant c);
}
