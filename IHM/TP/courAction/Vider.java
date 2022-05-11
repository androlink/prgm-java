package IHM.TP.courAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Vider extends AbstractAction {
    Fenetre target;

    Vider(Fenetre target){
        this.target=target;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Mmh");
        target.getC2().removeAllItems();
    }
}
