package qualitéDev.Sud;

import javax.swing.*;

public class JFileChooserDemo  {
    JFrame globalFrame = new JFrame();
    JTextPane sudoPane = new JTextPane();
    JScrollPane view = new JScrollPane(sudoPane);


    public JFileChooserDemo(){

        globalFrame.setVisible(true);
        globalFrame.setSize(400,400);
        globalFrame.setDefaultCloseOperation(3);


        globalFrame.add(view);



    }


    public static void main(String[] args) {
        JFileChooserDemo test = new JFileChooserDemo();
    }
    public void clearSudoku(){
        sudoPane.setText("");
    }
    public void drawSudoku(String str){
        sudoPane.setText(sudoPane.getText()+str);
    }
    public void drawSudokuln(String str){
        sudoPane.setText(sudoPane.getText()+str+"\n");
    }

}
