package IHM.TP.calculatrice;

import javax.swing.*;
import java.awt.*;

public class Calculatrice extends JFrame {
    JTextArea nb1=new JTextArea();
    JTextArea nb2=new JTextArea();
    JLabel resD = new JLabel();
    JButton res = new JButton("=");
    JPanel globale;

    String[] opList = {"*","+","/","-"};
    JComboBox operateur = new JComboBox(opList);




    public Calculatrice(){
        super("calculatrice");
        globale =(JPanel) getContentPane();
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400,200);
        setResizable(false);
        globale.add(nb1);
        globale.add(operateur);
        globale.add(nb2);
        globale.add(res);
        globale.add(resD);







    }
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();







    }



}
