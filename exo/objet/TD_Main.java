package exo.objet;

public class TD_Main {

    static AgenceImmobiliere plaza = new AgenceImmobiliere(10);

    public static void main(String[] args) {
        plaza.afficherBien();
        System.out.println(plaza.rechercheParRef(10));
        System.out.println(plaza.rechercheParRef(2));
        System.out.println(plaza.supprimerBien(9));
        System.out.println(plaza.rechercheParRef(9));
        plaza.afficherBien();
        System.out.println(plaza.ajouterUnBien(new BienImmobilier()));
        plaza.afficherBien();

    }




}
