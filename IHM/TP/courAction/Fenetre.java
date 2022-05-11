package IHM.TP.courAction;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    JMenuBar menuBar=new JMenuBar();



    JComboBox c1 = new JComboBox();
    JComboBox c2 = new JComboBox();
    JButton cp = new JButton("copier");
    JButton ev = new JButton("enlever");
    JButton vd = new JButton("vider");

    Fenetre(){
        cp.addActionListener(new Copie(this));
        ev.addActionListener(new Enlever(this));
        vd.addActionListener(new Vider(this));

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        for(int i = 0; i<10 ;i++)c1.addItem("hoy"+i);
        setLayout(new GridLayout());

        menuBar.add(menuConstruct());
        this.setJMenuBar(menuBar);


        add(c1);
        add(cp);
        add(c2);
        add(ev);
        add(vd);



        pack();
        setResizable(false);
        setVisible(true);
    }

    JMenu menuConstruct(){
        JMenu rtn=new JMenu("operation");
        JMenuItem m = new JMenuItem("copie");
        m.addActionListener(new Copie(this));
        rtn.add(m);
        m = new JMenuItem("enlever");
        m.addActionListener(new Enlever(this));
        rtn.add(m);
        m = new JMenuItem("vider");
        m.addActionListener(new Vider(this));
        rtn.add(m);
        m = new JMenuItem("quitter");
        m.addActionListener(l->{System.exit(0);});
        rtn.add(m);

        return rtn;
    }

    public JComboBox getC1() {
        return c1;
    }

    public void setC1(JComboBox c1) {
        this.c1 = c1;
    }

    public JComboBox getC2() {
        return c2;
    }

    public void setC2(JComboBox c2) {
        this.c2 = c2;
    }


    public static void main(String[] args) {
        new Fenetre();
    }




}
