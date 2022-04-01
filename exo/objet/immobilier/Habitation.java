package exo.objet.immobilier;

import exo.objet.BienImmobilier;

public class Habitation extends BienImmobilier {
    int prixAchat=0;
    public Habitation(int prix){
        super();
        this.prixAchat=prix;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Habitation{" +
                "prixAchat=" + prixAchat +
                '}';
    }
}
