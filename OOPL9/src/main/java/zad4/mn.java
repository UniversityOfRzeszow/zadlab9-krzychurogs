/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author krzysztof
 */
public class mn {
    
      public static void main(String[] args) {
       HashMap<String, String> tlumacz = new HashMap<>();
        tlumacz.put("woda", "water");
        tlumacz.put("ogien", "fire");
        tlumacz.put("krzeslo", "chair");
        tlumacz.put("drzewo", "tree");
        tlumacz.put("rzeka", "river");
        tlumacz.put("myszka", "mouse");
        tlumacz.put("komputer", "computer");
        tlumacz.put("pies", "dog");
        tlumacz.put("kot", "cat");
        tlumacz.put("szczur", "rat");
        tlumacz.put("rycerz", "knight");
        tlumacz.put("szkola", "school");
        tlumacz.put("uniwersytet", "university");
        tlumacz.put("impreza", "party");
        tlumacz.put("mama","mom");
        tlumacz.put("tata", "dad");
        tlumacz.put("szczuply", "slim");
        tlumacz.put("gruby", "fat");
        tlumacz.put("madry", "clever");
        tlumacz.put("glupi", "stupid");
        
       System.out.println("podaj jedno ze slow,aby uzyskac tlumaczenie(jesli");
       Scanner odczyt=new Scanner(System.in);
       String slowo=null;
       String slowo1="koniec";
       do
       {
               System.out.println("powiedz slowo");
          slowo=odczyt.nextLine();
           System.out.println("po polsku "+slowo+" a po angielsku "+tlumacz.get(slowo));
       }
       while(!slowo1.equals(slowo));
    }
}
