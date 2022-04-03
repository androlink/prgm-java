package IHM.TP.courLayout;

import javax.swing.*;
import java.awt.*;

public class TPLayout extends JFrame {

    TPLayout(){
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(300,200);
        setLayout(new GridLayout(3,0));
        JPanel global =(JPanel) getContentPane();
        JPanel haut = new JPanel(new FlowLayout());
        JButton milieu = new JButton("ou encore la!");
        JPanel bas = new JPanel(new BorderLayout());
        bas.add(new JLabel("sud-ouest"),BorderLayout.WEST);
        bas.add(new JLabel("sud-est"),BorderLayout.EAST);

        haut.add(new JButton("ici"));
        haut.add(new JButton("ou la!"));
        global.add(haut);
        global.add(milieu);
        global.add(bas);


    }





    public static void main(String[] args) {
        TPLayout test = new TPLayout();

    }
}
