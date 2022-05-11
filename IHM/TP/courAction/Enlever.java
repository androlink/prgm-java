package IHM.TP.courAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Enlever extends AbstractAction {
    Fenetre target;

    Enlever(Fenetre target){
        this.target=target;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Mmh");
        target.getC2().removeItem(target.getC1().getSelectedItem());
    }
}
