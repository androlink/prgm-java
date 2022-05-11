package test.movingFrame;

import javax.swing.*;
import java.awt.*;

public class MouseBlock {
    public static void main(String[] args) {
        JWindow w= new JWindow();
        w.setVisible(true);
        w.setSize(2,2);
        w.setAlwaysOnTop(true);

        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            w.setLocation(MouseInfo.getPointerInfo().getLocation().x-1,MouseInfo.getPointerInfo().getLocation().y-1);
        }
    }

}
