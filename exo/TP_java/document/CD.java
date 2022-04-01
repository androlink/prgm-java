package exo.TP_java.document;

import exo.TP_java.DocBibliotheque;

import java.util.Arrays;

public class CD extends DocBibliotheque {
    int codeArchivage;
    String[] morceaux;


    public CD(int codeArchivage, String[] morceaux) {
        this.codeArchivage = codeArchivage;
        this.morceaux = morceaux;
        typeDoc="CD";
    }

    public CD(String titre, String code, String artiste, int annee, int codeArchivage, String[] morceaux) {
        super(titre, code, artiste, annee);
        this.codeArchivage = codeArchivage;
        this.morceaux = morceaux;
        typeDoc="CD";
    }
    public CD(String titre, String code, String auteur, int annee) {
        super(titre, code, auteur, annee);
        typeDoc="CD";
    }

    @Override
    public String toString() {
        return "CD{" +
                "codeArchivage=" + codeArchivage +
                ", morceaux=" + Arrays.toString(morceaux) +
                '}';
    }

    public int getCodeArchivage() {
        return codeArchivage;
    }

    public void setCodeArchivage(int codeArchivage) {
        this.codeArchivage = codeArchivage;
    }

    public String[] getMorceaux() {
        return morceaux;
    }

    public void setMorceaux(String[] morceaux) {
        this.morceaux = morceaux;
    }
}
