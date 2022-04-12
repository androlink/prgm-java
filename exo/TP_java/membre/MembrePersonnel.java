package exo.TP_java.membre;

import exo.TP_java.DocBibliotheque;
import exo.TP_java.MembreBibliotheque;
import exo.TP_java.notification.Notifiable;

public class MembrePersonnel extends MembreBibliotheque {

    public MembrePersonnel(String nom, String prenom, int noTel, String adresse) {
        super(nom, prenom, noTel, adresse);
    }

    public boolean peutEmprunterUnAutreDocument(){
        boolean test = false;
        if(getNbDocEmprunte()<8)test=true;
        return test;
    }

    @Override
    public boolean docDisponible(DocBibliotheque d) {
        System.out.println("Le document "+ d + "qui a été réservé par le membre du personnel "+this+" est désormais disponible à l’emprunt au bureau des réservations");
        return false;
    }
}
