/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Samochod {
    private String marka;
    private String nazwa_samochodu;
    private int maxpredkosc;
    private int cena;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa_samochodu() {
        return nazwa_samochodu;
    }

    public void setNazwa_samochodu(String nazwa_samochodu) {
        this.nazwa_samochodu = nazwa_samochodu;
    }

    public int getMaxpredkosc() {
        return maxpredkosc;
    }

    public void setMaxpredkosc(int maxpredkosc) {
        this.maxpredkosc = maxpredkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Samochod(String marka, String nazwa_samochodu, int maxpredkosc, int cena) {
        this.marka = marka;
        this.nazwa_samochodu = nazwa_samochodu;
        this.maxpredkosc = maxpredkosc;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka=" + marka + ", nazwa_samochodu=" + nazwa_samochodu + ", maxpredkosc=" + maxpredkosc + ", cena=" + cena + '}';
    }
    
    
    
    public static void main(String[] args) {
        List<Object>lista=new ArrayList<Object>();
        Samochod nr1=new Samochod("fiat","stilo",150,3000);
        Samochod nr2=new Samochod("fiat","punto",140,2000);
         Samochod nr3=new Samochod("opel","corsa",150,3000);
         Samochod nr4=new Samochod("fiat","Uno",190,6000);
          Samochod nr5=new Samochod("Opel","Corsa",150,3000);
        lista.add(nr1);
        lista.add(nr2);
        lista.add(nr3);
        lista.add(nr4);
        lista.add(nr5);
        System.out.println(lista.get(0).toString());
        System.out.println(lista.get(1).toString());
        System.out.println(lista.get(2).toString());
        System.out.println(lista.get(3).toString());
        System.out.println(lista.get(4).toString());
    
}
}