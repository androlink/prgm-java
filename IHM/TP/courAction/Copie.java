package IHM.TP.courAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Copie extends AbstractAction {
    Fenetre target;

    Copie(Fenetre target){
        this.target=target;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Mmh");
        target.getC2().addItem(target.getC1().getSelectedItem());
    }
}
