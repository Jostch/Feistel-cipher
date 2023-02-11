/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feistelciphertp;
import javax.swing.*;
import java.util.Arrays;
/**
 *
 * @author GroupMCS
 */
public class FeistelCipherTp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La génération de clés
        int[] tabCle;
        int taille;
        int[] tabPermut;
        int[] tabTemp;
        int position = 0;
        int kGauche, kDroite;
        //
        taille = Integer.parseInt(JOptionPane.showInputDialog("ENTERER LA TAILLE DE LA CLE QUI EST EN 8 BITS !"));
        tabCle = new int[taille];
        tabPermut = new int[taille];
        tabTemp = new int[taille];
        //
        if (taille != 8) {
            JOptionPane.showMessageDialog(null, "LE NOMBRE DE BIT DEMANDE N'EST PAS CORRECT !");
            System.exit(0);
        } else {
            for (int i = 0; i < tabCle.length; i++) {
                tabCle[i] = Integer.parseInt(JOptionPane.showInputDialog("ENTRER LE BIT NUMERO : " + i));
            }
        }
        //
        System.out.print("LA CLE EST K = ");
        for (int i = 0; i < tabCle.length; i++) {
            System.out.print(tabCle[i] + " | ");
        }
        System.out.println("");
        //
        // Recevoir les valeurs de la permutation
        for (int i = 0; i < tabPermut.length; i++) {
            tabPermut[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRER LES VALEURS POUR LA PERMUTATION : " + i));
        }
        System.out.print("LA FONCTION DE PERMUTATION H = ");
        for (int i = 0; i < tabPermut.length; i++) {
            System.out.print(tabPermut[i] + " | ");
        }
        System.out.println("");
       //
       // Faire la permitation
        for (int i = 0; i < tabCle.length; i++) {
            position = tabPermut[i];
            tabTemp[i] = tabCle[position];
        }
        tabCle = tabTemp;
        //System.out.println("LA VALEUR PERMUTEE K = " + Arrays.toString(tabCle));
        System.out.print("LA VALEUR PERMUTEE K = ");
        for (int i = 0; i < tabCle.length; i++) {
            System.out.print(tabCle[i] + " | ");
        }
        System.out.println("");
        //
        // Diviser en deux blocs de 4 bits K = K'1 || K'2
        System.out.println("K1 = " + tabCle[0] + " " + tabCle[1] + " " + tabCle[2] + " " + tabCle[3]);
        //
        System.out.println("K2 = " + tabCle[4] + " " + tabCle[5] + " " + tabCle[6] + " " + tabCle[7]);
        //
        if (true) {
            
        } else {
        }
    }
    
}
