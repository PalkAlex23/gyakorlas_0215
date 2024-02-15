/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyakorlas;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class OtosLotto {
    
    public static void main(String[] args) {
        /* deklarálás */
        final int SZAM_DB = 90;
        boolean[] szelveny = new boolean[SZAM_DB + 1];
        
        /* inicializálás */
        for (int i = 0; i < SZAM_DB + 1; i++) {
            szelveny[i] = false;
        }
        
        /* húzás */
        int db = 0;
        while (db < 5) {
            int szam = (int) (Math.random()*90)+1;
            if (!szelveny[szam]) {
                szelveny[szam] = true;
                db++;
            }
        }
    }
    
}
