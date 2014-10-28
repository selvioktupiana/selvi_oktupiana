/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.TugasArray;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SelviOktupiana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array , x;
        //INPUTAN PANJANG ARRAY
        System.out.print("Masukkan Panjang Array : ");
        array = new Scanner(System.in).nextInt();
        
        String nama[]=new String [array];
        int nilai[];
        nilai = new int [array];
        
        //INPUTAN UNTUK NAMA DAN NILAI
        for(x=0;x<array;x++)
        {
            System.out.print("Masukkan Nama Ke "+(x+1)+" = ");
            nama[x]=new Scanner(System.in).nextLine();
            System.out.print("Masukkan Nilai Ke "+(x+1)+" = ");
            nilai[x]=new Scanner(System.in).nextInt();
        }
        //OUTPUT
        System.out.println("");
        for(x=0;x<array;x++)
        {
            System.out.println("Nama Ke"+(x+1)+" :"+nama[x]+" dengan Nilai "+nilai[x]);
        }
    }
    
}
