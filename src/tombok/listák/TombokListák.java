/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok.listák;

/**
 *
 * @author patri
 */
public class TombokListák {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        
        //Tömb 1D
        //Fix méretüek
        
        int[] szamok = new int[2];
        
        szamok[0] = a;
        szamok[1] = b;
        
        int asd = szamok.length;
        
        System.out.println(asd);
        
        System.out.println(szamok.length);
        
        String szo = "Almafa";
        
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        int[] szam = new int[3];
        
       szam[0] = 3;
       szam[1] = 2;
       szam[2] = 9;
       
       int eredmeny = szam[0] + szam[1] + szam[2];
       
        System.out.println(eredmeny);
    } 
    
}
