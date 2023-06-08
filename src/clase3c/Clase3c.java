/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3c;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Clase3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inNum;
        int myNum;
        myNum = 0;
        inNum = JOptionPane.showInputDialog("Digite un valor.");
        myNum = Integer.parseInt(inNum);
        for (int i = 1; i <= myNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
