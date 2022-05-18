package IHM.TP.generateurNomStarWars;

import javax.swing.*;

public class generateur {

    generateur(){
        JFrame frame = new JFrame("generateur de nom");
        String nom = JOptionPane.showInputDialog(frame,"Entrez votre nom:");
        String prenom = JOptionPane.showInputDialog(frame,"Entrez votre prenom:");
        String nomJFMere = JOptionPane.showInputDialog(frame,"Entrez le nom de jeune fille de la mère:");
        String villeDeNaissance = JOptionPane.showInputDialog(frame,"Entrez le nom de la ville de naissance:");
        JOptionPane.showMessageDialog(frame,"maintenant tu t'appeleras: " + nom.substring(0,3)+prenom.substring(0,2)+" "+nomJFMere.substring(0,2)+villeDeNaissance.substring(0,3));
    }



    public static void main(String[] args)
    {
        new generateur();
    }
}
