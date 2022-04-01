package exo.objet;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    static ArrayList<BienImmobilier> maison = new ArrayList<BienImmobilier>();
    static ArrayList<Proprietaire> prop = new ArrayList<Proprietaire>();



    public static void main(String[] args) {
        maison.add(new BienImmobilier());
        maison.add(new BienImmobilier());
        maison.add(new BienImmobilier());
        maison.add(new BienImmobilier());

        prop.add(new Proprietaire());
        prop.add(new Proprietaire());


        menu();
    }

    static void menu(){
        boolean run=true;


        do{

            System.out.println();
            System.out.println(maison.get(choix_de_la_maison()));

        }while(run);

    }
    static int choix_de_la_maison(){
        if(maison.size()==0)return 0;
        Scanner mmh = new Scanner(System.in);
        int choie=-1;
        while(choie<0 || choie >maison.size()) {
            System.out.println("choisissez la maison : ");
            for (int i = 0; i < maison.size(); i++) {
                System.out.println(" - maison : " + i);
            }

            choie=mmh.nextInt();
        }
        return choie;
    }




    public static int compTaxes(double t1,double t2){
        return (int) (t1-t2);
    }


}
