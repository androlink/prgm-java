package exo.objet;

public class Proprietaire {
    String id="";
    String addr="";
    double taxe=0;
    BienImmobilier possede;
    boolean Residance2=false;

    public Proprietaire(){

    }
    public Proprietaire(String id,String addr){
        this.id=id;
        this.addr=addr;
    }


    @Override
    public String toString() {
        return id;
    }

    public double getTaxe() {
        return taxe;
    }
    public String getAddr() {
        return addr;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }
    public void setResidance2(boolean residance2) {
        Residance2 = residance2;
    }
}
