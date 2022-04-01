package exo.TP_java.document;

import exo.TP_java.DocBibliotheque;

public class Livre extends DocBibliotheque {
    String editeur="none";
    int nbPage;
    String ISBN;

    public Livre(String titre, String code, String auteur, int annee, String editeur, int nbPage, String ISBN) {
        super(titre, code, auteur, annee);
        this.editeur = editeur;
        this.nbPage = nbPage;
        this.ISBN = ISBN;
        typeDoc="Livre";
    }

    public Livre(String titre, String code, String auteur, int annee) {
        super(titre, code, auteur, annee);
        this.editeur = editeur;
        typeDoc="Livre";
    }

    public Livre(){
        typeDoc="Livre";

    }


    @Override
    public String toString() {
        return "Livre{" +
                "editeur='" + editeur + '\'' +
                ", nbPage=" + nbPage +
                ", ISBN=" + ISBN +
                '}';
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
