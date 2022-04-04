package exo.TP_java;

import exo.TP_java.notification.Notifiable;

import java.util.ArrayList;

public class MembreBibliotheque implements Notifiable {
    static public int dernierNumeroAbonne =0;
    private int noMemebre;
    private String nom;
    private String prenom;
    private int noTel;
    private String adresse;


    int emprunté=0;


    public MembreBibliotheque(){
        noMemebre= dernierNumeroAbonne++;
    }

    public MembreBibliotheque(String nom,String prenom,int noTel,String adresse){
        this.adresse=adresse;
        this.prenom=prenom;
        this.noTel=noTel;
        this.nom=nom;

    }

    boolean emprtunter(CatalogueBibliotheque b,int index){
     return b.emprunterDoc(index,this);
    }



    public boolean peutEmprunterUnAutreDocument(){
        return true;
    }


    public int getNbDocEmprunte(){
    return emprunté;
}


    void removeDoc(){
        emprunté--;
}
    void addDoc(){
        emprunté++;
    }
    public String affMembre(){
        return "Membre no : " + noMemebre + " nom : " + nom +" prenom : " + prenom;
    }
    @Override
    public String toString() {
        return "MembreBibliotheque{" +
                "noMemebre=" + noMemebre +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", noTel=" + noTel +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public void setNoMemebre(int noMemebre) {
        this.noMemebre = noMemebre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNoTel(int noTel) {
        this.noTel = noTel;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNoMemebre() {
        return noMemebre;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNoTel() {
        return noTel;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public boolean docDisponible(DocBibliotheque d) {
        return false;
    }
}
