package exo.TP_java;

import exo.TP_java.membre.MembreEtudiant;
import exo.TP_java.membre.MembrePersonnel;
import exo.TP_java.personalExeption.NombreHorsLimiteException;

import java.util.ArrayList;

public class Test {
    static CatalogueBibliotheque bibliotheque = new CatalogueBibliotheque();
    static ListeMembre membres = new ListeMembre();
    public static void main(String[] args) {
        bibliotheque.ajDoc(new DocBibliotheque("intro a JAVA", "004. 178 K20PM", "j.leblanc", 2015));
        bibliotheque.ajDoc(new DocBibliotheque("SDD", "967. 4987 T248O", "M.macin", 2022));
        membres.ajMembre(new MembreEtudiant("bob", "pat", 0, "me"));
        membres.ajMembre(new MembrePersonnel("michel", "nog", 1, "ma"));

        System.out.println(membres.accesMembre(1));

        System.out.println( bibliotheque.emprunterDoc(0,membres.accesMembre(0)));
        System.out.println( bibliotheque.reserverDoc(0,membres.accesMembre(1)));
        System.out.println( bibliotheque.rendreDoc(0));


    }
}
