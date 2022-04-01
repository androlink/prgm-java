package exo.objet.immobilier;

import exo.objet.BienImmobilier;

public class Rapport extends BienImmobilier {
    int prix;
    public Rapport(int prix){
        super();
        this.prix=prix;

    }

    @Override
    public String toString() {
        return super.toString() +
                "Rapport{" +
                "prix=" + prix +
                '}';
    }
}
