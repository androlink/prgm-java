package exo.objet.immobilier;

import exo.objet.BienImmobilier;

public class Commercial extends BienImmobilier {
    CommerceType type;


    public Commercial(CommerceType c){
        super();
        this.type=c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Commercial{" +
                "type=" + type +
                '}';
    }
}
