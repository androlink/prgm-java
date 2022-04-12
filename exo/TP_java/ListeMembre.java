package exo.TP_java;

import java.util.ArrayList;

public class ListeMembre {
    static ArrayList<MembreBibliotheque> membres = new ArrayList<>();

    public ListeMembre() {
    }
    public MembreBibliotheque accesMembre(int num){
        for(MembreBibliotheque m : membres){
            if(m.getNoMembre()==num)return m;
        }
        return null;
    }
    public boolean ajMembre(MembreBibliotheque m){
        boolean test = false;
        if(!membres.contains(m)) {
            membres.add(m);
            test=true;
            System.out.println("add new membre "+m.getNoMembre());
        }
        return test;
    }
}
