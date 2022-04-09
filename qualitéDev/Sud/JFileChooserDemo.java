package qualitéDev.Sud;

import javax.swing.*;


/**
 * class d'affichage des solution du sudoku
 *
 */
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
    }//pour les test ne serre pas au, programme principal

    public void clearSudoku(){
        sudoPane.setText("");
    }//vide la zone de texte
    public void drawSudoku(String str){
        sudoPane.setText(sudoPane.getText()+str);
    }//ajoute une chaine de caractere
    public void drawSudokuln(String str){
        sudoPane.setText(sudoPane.getText()+str+"\n");
    }//ajoute une chaine de caractere puis un retour a la ligne

}
