/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random losujLiczby = new Random();
        
        int tab[]= new int[10];
        
        for (int i = 1; i < tab.length; i++) {
            tab[i] = losujLiczby.nextInt(101);
        }
        TreeSet<Integer>liczby= new TreeSet<Integer>();
        Iterator<Integer>iterator=liczby.iterator();
        
        for(int i=0;i<tab.length;i++)
        {
            liczby.add(tab[i]);
        }
       iterator = liczby.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n ");
        }
 
        
        
    }
    
}
