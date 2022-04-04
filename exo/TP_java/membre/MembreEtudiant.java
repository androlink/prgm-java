package exo.TP_java.membre;

import exo.TP_java.DocBibliotheque;
import exo.TP_java.MembreBibliotheque;
import exo.TP_java.notification.Notifiable;

public class MembreEtudiant extends MembreBibliotheque implements Notifiable {

    public MembreEtudiant(String nom, String prenom, int noTel, String adresse) {
        super(nom, prenom, noTel, adresse);
    }

    public boolean peutEmprunterUnAutreDocument(){
        boolean test = false;
        if(getNbDocEmprunte()<4)test=true;
        return test;

    }
    public boolean docDisponible(DocBibliotheque d) {
        System.out.println("Le document "+ d + "qui a été réservé par le membre "+this+" est désormais disponible à l’emprunt au bureau des réservations");
        System.out.println("voulez vous l'emprunter");

        return true;
    }

}
