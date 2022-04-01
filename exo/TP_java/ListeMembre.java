package exo.TP_java;

import java.util.ArrayList;

public class ListeMembre {
    static ArrayList<MembreBibliotheque> membres = new ArrayList<>();

    public ListeMembre() {
    }
    public MembreBibliotheque accesMembre(int num){
        for(MembreBibliotheque m : membres){
            if(m.getNoMemebre()==num)return m;
        }
        return null;
    }
    public boolean ajMembre(MembreBibliotheque m){
        boolean test = false;
        if(!membres.contains(m)) {
            membres.add(m);
            test=true;
        }
        return test;
    }
}
