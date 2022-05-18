package IHM.TP.calculDialog;

import javax.swing.*;

public class Calcul {


    Calcul(){

        JFrame frame = new JFrame("generateur de nom");
        String nombre1 = JOptionPane.showInputDialog(frame,"Entrez votre un nombre:");
        Float nb1 = Float.valueOf(nombre1);
        String nombre2 = JOptionPane.showInputDialog(frame,"Entrez un autre nombre:");
        Float nb2 = Float.valueOf(nombre2);
        String op = JOptionPane.showInputDialog(frame,"Entrez l'operateur voulu:");

        JOptionPane.showMessageDialog(frame,nombre1+""+op+""+nombre1+"="+ calc(nb1,nb2,op));


    }

    Float calc(float nb1,float nb2,String op){

        switch (op){
            case "+" -> {return nb1+nb2;}
            case "*" -> {return nb1*nb2;}
            case "/" -> {return nb1/nb2;}
            case "-" -> {return nb1-nb2;}
        }



        return 0f;
    }


    public static void main(String[] args){new Calcul();}

}
