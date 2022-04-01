package exo.TP_java.document;

import exo.TP_java.DocBibliotheque;
import exo.TP_java.MembreBibliotheque;

public class DocUrl extends DocBibliotheque {
    int codeArchivage;
    String url;
    String description;

    public DocUrl(String titre, String code, String auteur, int annee, int codeArchivage, String url, String description) {
        super(titre, code, auteur, annee);
        this.codeArchivage = codeArchivage;
        this.url = url;
        this.description = description;
        typeDoc="DocUrl";
    }

    public DocUrl(String titre, String code, String auteur, int annee) {
        super(titre, code, auteur, annee);
        typeDoc="DocUrl";
    }

    public DocUrl(int codeArchivage, String url, String description) {
        this.codeArchivage = codeArchivage;
        this.url = url;
        this.description = description;
        typeDoc="DocUrl";
    }

    public DocUrl(){
        typeDoc="DocUrl";
    }

    @Override
    public boolean emprunt(MembreBibliotheque me) {
    return false;
    }
    @Override
    public boolean reservation(MembreBibliotheque me) {
        return false;
    }
    @Override
    public boolean retour() {
        return false;
    }
    @Override
    public boolean rangement() {
        return false;
    }
}
