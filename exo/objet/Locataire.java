package exo.objet;

public class Locataire {
    String id="";
    String addr="";
    double loyer=0;
    BienImmobilier appartement;
    public Locataire(){

    }
    public Locataire(String id,String addr){
        this.id=id;
        this.addr=addr;
    }


    void nouvelleLocation(BienImmobilier appartement){
        this.appartement=appartement;
    }

    @Override
    public String toString() {
        return  id;
    }

    public String getId() {
        return id;
    }

    public String getAddr() {
        return addr;
    }

    public double getLoyer() {
        return loyer;
    }
}

