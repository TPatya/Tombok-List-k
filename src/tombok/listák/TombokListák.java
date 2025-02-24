/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok.listák;

import java.util.ArrayList;
import java.util.List;

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
        
        String[] szavak = new String[3];
        
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        String[] szavak2 = {"alma", "körte", "eper"};
        
        //2D
        
        int[][] matrix = new int[3][3];  //[sor][oszlop] 3*3
        
        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int sor = matrix2.length;
        
        int oszlop = matrix2[0].length;
        
        String[][] termekek = {
            {"Kenyér", "1000 Ft"},
            {"Tej", "520 Ft"},
            {"Parizer", "600 Ft"}
        };
        System.out.println("Termék neve: " + termekek[1][0] + "-" + termekek[1][1]);    
        
        
        List<Integer> szamlista = new ArrayList<>();
        
        szamlista.add(10);
        szamlista.add(4);
        
        int listameret = szamlista.size();
        System.out.println(listameret);
        
        int kivalasztott = szamlista.get(0);
        System.out.println(kivalasztott);
        
        //szamlista.remove(1); //4 est tőrli
        
        szamlista.set(1,9);
        
        int index = szamlista.indexOf(10);
        
        boolean tartalmaz = szamlista.contains(10);
        System.out.println(tartalmaz);
        
        boolean ures = szamlista.isEmpty();
        
        szamlista.clear(); //üres lista
        
        List<String> Nevek = new ArrayList<>();
        Nevek.add("Zoltán");
        Nevek.add("Emese");
        Nevek.add("Gábor");
        
        System.out.println("A lista 2. Eleme: " + Nevek.get(1));
        
        Nevek.add("Mário");
        
        System.out.println(Nevek.size());
                
    } 
    
}
