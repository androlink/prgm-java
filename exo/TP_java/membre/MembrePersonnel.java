package exo.TP_java.membre;

import exo.TP_java.MembreBibliotheque;

public class MembrePersonnel extends MembreBibliotheque {

    public MembrePersonnel(String nom, String prenom, int noTel, String adresse) {
        super(nom, prenom, noTel, adresse);
    }

    public boolean peutEmprunterUnAutreDocument(){
        boolean test = false;
        if(getNbDocEmprunte()<8)test=true;
        return test;
    }

}
