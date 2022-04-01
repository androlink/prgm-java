package exo.TP_java;

import exo.TP_java.personalExeption.NombreHorsLimiteException;

public class Test {
    static CatalogueBibliotheque bibliotheque = new CatalogueBibliotheque();
    static ListeMembre membres = new ListeMembre();
    public static void main(String[] args) {
        bibliotheque.ajDoc(new DocBibliotheque("intro a JAVA", "004. 178 K20PM", "j.leblanc", 2015));
        bibliotheque.ajDoc(new DocBibliotheque("SDD", "967. 4987 T248O", "M.macin", 2022));
        membres.ajMembre(new MembreBibliotheque("bob", "pat", 0, "me"));
        membres.ajMembre(new MembreBibliotheque("michel", "nog", 1, "ma"));
        bibliotheque.emprunterDoc(1,membres.accesMembre(0));
        bibliotheque.afficheDocsEmpruntes();
        bibliotheque.selectDoc().printBook();
        System.out.println(membres.accesMembre(0).getNbDocEmprunte());
        try {
            bibliotheque.accesDoc(-1);
        } catch (NombreHorsLimiteException e) {
            e.printStackTrace();


        }

    }
}
