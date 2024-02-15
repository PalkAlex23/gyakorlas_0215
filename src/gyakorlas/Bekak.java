/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyakorlas;

import java.util.Scanner;

public class Bekak {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String beka = "🐸";
        String level = "_";
        String[] jatekter = {beka, beka, beka, level};
        
        /* megjelenítés */
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println("");
        
        /* választás */
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%-2s ", i+1);
        }
        System.out.println("");
        
        /* bekérés */
        System.out.print("Melyikkel lépsz (1 - 4): ");
        int hely = sc.nextInt();
        
        /* döntés, nem algoritmizált */
        if (hely == 1 || hely == 4) {
            System.out.println("Ezzel nem léphetsz!");
        } else if (hely == 2) {
            jatekter[0] = beka;
            jatekter[1] = level;
            jatekter[2] = beka;
            jatekter[3] = beka;
        } else if (hely == 3) {
            jatekter[0] = beka;
            jatekter[1] = beka;
            jatekter[2] = level;
            jatekter[3] = beka;
        }
        
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println("");
    }
}