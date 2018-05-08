/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Random;

/**
 *
 * @author maarchyl
 */
public class Main {
    private static void bsort(int tab[]) {
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
   public static void wypistab(int tab[])
   {
       for(int i=0;i<tab.length;i++)
       {
           System.out.println(tab[i]);
       }
   }
    public static void main(String[] args) {
        Random losujLiczby = new Random();
        
        int tab[]= new int[10];
        
        for (int i = 1; i < tab.length; i++) {
            tab[i] = losujLiczby.nextInt(101);
        }
       bsort(tab);
       wypistab(tab);
       
        
        
        
        
    }
    
}
