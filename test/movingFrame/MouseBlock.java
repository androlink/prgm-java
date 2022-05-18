package test.movingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class MouseBlock {
    public static void main(String[] args) {
        JWindow w= new JWindow();
        w.setVisible(true);
        w.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        //GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(w);
        w.setAlwaysOnTop(true);
        w.setBackground(new Color(255,255,255,0));
        Random r = new Random();

        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //w.setBackground(new Color(Math.abs(r.nextInt())%256,Math.abs(r.nextInt())%256,Math.abs(r.nextInt())%256,50));



            //w.setLocation(MouseInfo.getPointerInfo().getLocation().x-w.getWidth()/2,MouseInfo.getPointerInfo().getLocation().y-w.getHeight()/2);
        }

    }

}
