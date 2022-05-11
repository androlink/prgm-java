package test.movingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Objects;


public class Round {



    public static void main(String[] args) {
        int n=0;

        ArrayList<JWindow> windows =new ArrayList<>();

        for(int i=0;i<n;i++){
            JWindow w= new JWindow();
            w.setVisible(true);
            w.setSize(20,20);
            w.setAlwaysOnTop(true);
            windows.add(w);
        }




        float i=0;
        boolean test=true;

        while (true){

            if(Objects.equals(MouseInfo.getPointerInfo().getLocation(), new Point(0, 0))) {
                if (test){
                    JWindow w = new JWindow();
                    w.setVisible(true);
                    w.setSize(20, 20);
                    w.setAlwaysOnTop(true);
                    w.setShape(new Ellipse2D.Float());
                    windows.add(w);
                    test=false;
                }

            }else test=true;

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            for(int j=0;j<windows.size();j++) {
                JWindow w= windows.get(j);

                w.setLocation(new Point((int) (Math.cos(i+((float)j/windows.size())*Math.PI*2) * 100) + MouseInfo.getPointerInfo().getLocation().x - w.getWidth(), (int) (Math.sin(i+((float)j/windows.size())*Math.PI*2) * 100) + MouseInfo.getPointerInfo().getLocation().y - w.getHeight()));
            }

            i+=0.2;
        }

    }
}
