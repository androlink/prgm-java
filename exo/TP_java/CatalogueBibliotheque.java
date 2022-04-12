package exo.TP_java;

import exo.TP_java.personalExeption.NombreHorsLimiteException;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueBibliotheque {
    static ArrayList<DocBibliotheque> docs = new ArrayList<>();

    public CatalogueBibliotheque(){
    }

    public int compteCDs(){
        int count=0;
        for(int i = 0 ; i < docs.size();i++)if(docs.get(i).typeDoc=="CD")count++;
        return count;
    }
    public int compteLivre(){
        int count=0;
        for(int i = 0 ; i < docs.size();i++)if(docs.get(i).typeDoc=="Livre")count++;
        return count;
    }

    public void afficheDocsEmpruntes(){
        for (DocBibliotheque d: docs) {
            if(d.ou== DocBibliotheque.etat.emprunté) d.printBook();
        }
    }
    public void afficheTousLesDocs(){
        for (DocBibliotheque d: docs) {
            d.printBook();
        }
    }
    public boolean rendreDoc(int indiceDoc){
        boolean test=false;
        if(indiceDoc>=0 && indiceDoc< docs.size()){
            test= docs.get(indiceDoc).retour();
        }
        return test;
    }
    public boolean annulResaDoc(int indiceDoc){
        boolean test=false;
        if(indiceDoc>=0 && indiceDoc< docs.size()){
            test= docs.get(indiceDoc).dereservation();
        }
        return test;
    }
    public boolean reserverDoc(int indiceDoc , MembreBibliotheque m){
        boolean test=false;
        if(indiceDoc>=0 && indiceDoc< docs.size()){
            test= docs.get(indiceDoc).reservation(m);

        }
        return test;
    }
    public boolean emprunterDoc(int indiceDoc , MembreBibliotheque m){
        boolean test = false;
        try {
            if (indiceDoc >= 0 && indiceDoc < docs.size()) {
                test = docs.get(indiceDoc).emprunt(m);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
    }
    public DocBibliotheque accesDoc(int i) throws NombreHorsLimiteException {

        if(i<0||i>docs.size())throw new NombreHorsLimiteException(i);
        DocBibliotheque test = null;
        if(i>=0 && i< docs.size()) test= docs.get(i);
        return test;
    }
    public boolean supDoc(DocBibliotheque d){
        boolean test = false;
        if(!docs.contains(d)) {
            docs.remove(d);
            test = true;
        }
        return test;
    }
    public boolean ajDoc(DocBibliotheque d) {
        boolean test = false;
        if (!docs.contains(d)){
            test = true;
        docs.add(d);
    }
        return test;
    }
    public DocBibliotheque selectDoc(){
        Scanner input = new Scanner(System.in);
        int indexLivre = 0;
        do {
            System.out.println("selectionner un document");
            int count = 1;
            System.out.println("0 - quitter");
            for (DocBibliotheque d : docs) System.out.println(count++ + " - " + d.getName());
            indexLivre = input.nextInt() - 1;
        } while (indexLivre < -1 || indexLivre > docs.size());
        return docs.get(indexLivre);

    }

}
