package exo.TP_java.membre;

import exo.TP_java.MembreBibliotheque;

public class MembreEtudiant extends MembreBibliotheque {

    public MembreEtudiant(String nom, String prenom, int noTel, String adresse) {
        super(nom, prenom, noTel, adresse);
    }

    public boolean peutEmprunterUnAutreDocument(){
        boolean test = false;
        if(getNbDocEmprunte()<4)test=true;
        return test;
    }

}
