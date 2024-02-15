/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyakorlas;

import java.util.Scanner;

public class Amoba {
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Az első jel: (x/o): ");
        String elso = sc.nextLine();
        
        /* játéktér */
        final int MERET = 3;
        String[] amoba = new String[MERET*MERET];
        amoba[0] = elso;
        
        /* generálás */
        for (int i = 1; i < MERET*MERET; i++) {
            amoba[i] = Math.random()>.5 ? "x" : "o";
        }
        
        /* megjelenítés */
        for (int i = 0; i < MERET*MERET; i++) {
            if (i != 0 && i % MERET == 0) {
                System.out.println("");
            }
            System.out.print(amoba[i]);
        }
        System.out.println("");
    }
}
