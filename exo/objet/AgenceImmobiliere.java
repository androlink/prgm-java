package exo.objet;

import java.util.Arrays;

public class AgenceImmobiliere {
    int nbMaison;

    BienImmobilier[] maison;

    AgenceImmobiliere(int qteDeMaison){
        this.nbMaison=qteDeMaison;
        maison =new BienImmobilier[qteDeMaison];
        while(getLastIndex()<maison.length)ajouterUnBien(new BienImmobilier());

    }

    public int supprimerBien(int ref){
        int index=rechercheParRef(ref);
        if(index!=-1)
        {
            maison[index]=maison[getLastIndex()-1];
            maison[getLastIndex()-1]=null;
        }
        return index;
    }

    public boolean ajouterUnBien( BienImmobilier b){
        if(getLastIndex()<maison.length)maison[getLastIndex()]=b;
        else return false;
    return true;
    }

    public int rechercheParRef(int ref){
        if(ref>=0 && ref<BienImmobilier.reference){
            int i=0;
            while(i<getLastIndex())if(ref==maison[i].getId())return i;else i++;
        }
        return -1;
    }

    public void afficherBien(){
        int i=0;
        while(i<maison.length) System.out.println(maison[i++]);

    }

    int getLastIndex(){
        int i = 0;
        int count =0;
        while(i<maison.length && maison[i++]!=null)count++;
        return count;
    }
    @Override
    public String toString() {
        return "AgenceImmobiliere{" +
                "nbMaison=" + nbMaison +
                ", maison=" + Arrays.toString(maison) +
                '}';
    }
}
