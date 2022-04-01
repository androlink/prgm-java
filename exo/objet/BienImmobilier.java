package exo.objet;

import static java.lang.Math.round;

public class BienImmobilier {
    public static int reference;
    int id;

    String description;
    int surface;
    /*
    0: libre
    1: location
    2: vente
    3: occupé
     */
    int etat=2;
    int tarif;
    double tauxImpot;
    double taxeFonciere;

    Locataire locataire;
    Proprietaire proprietaire;

    public BienImmobilier(){
        id=reference;
        reference++;
    }
    public BienImmobilier(int surface, int tarif, double tauxImpot){
        id=reference; reference++;
        this.surface=surface;
        this.tarif=tarif;
        this.tauxImpot=tauxImpot;
        taxeFonciere=calcTaxeFoncière();
    }
    public void nouveauLocataire(Locataire locataire){
        if(locataire==null)return;
        this.locataire=locataire;
        locataire.appartement=this;
        etat=3;
    }
    public void setProprietaire(Proprietaire proprietaire){
        if(proprietaire==null)return;
        this.proprietaire=proprietaire;
        proprietaire.possede=this;
        etat=1;
    }
    public double calcTaxeFoncière(){
        taxeFonciere=round((surface*tarif*12)/4 * tauxImpot );
        taxeFonciere/=100;
        return taxeFonciere;
    }
    public double getTaxeFonciere(){
        return taxeFonciere;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BienImmobilier{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", surface=" + surface +
                ", etat=" + etat +
                ", tarif=" + tarif +
                ", tauxImpot=" + tauxImpot +
                ", taxeFonciere=" + taxeFonciere +
                ", locataire=" + locataire +
                ", proprietaire=" + proprietaire +
                '}';
    }
}
