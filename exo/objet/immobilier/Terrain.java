package exo.objet.immobilier;

import exo.objet.BienImmobilier;
import exo.objet.Locataire;


public class Terrain extends BienImmobilier {
    boolean viabilisé=false;
    public Terrain(boolean viabilisé){
        super();
        this.viabilisé=viabilisé;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Terrain{" +
                "viabilisé=" + viabilisé +
                '}';
    }

    @Override
    /**
     * nullification de nouveauLocataire pour un terrain
     */
    public void nouveauLocataire(Locataire locataire) {
    }
}
