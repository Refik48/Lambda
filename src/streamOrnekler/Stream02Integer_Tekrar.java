package streamOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream02Integer_Tekrar {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
        liste.add(500);
        tekKareYazdir(liste);
        System.out.println("\n TOPLAM: " + tekKareToplami(liste));
    }
    public static void tekKareYazdir(List<Integer> l){
        l.stream().filter(Stream01Integer_Tekrar::tekMi).map(x->x*x).forEach(Stream01Integer_Tekrar::yazdir);
    }

    public static Integer tekKareToplami(List <Integer> l){
     // return    l.stream().filter(Stream01Integer_Tekrar::tekMi).map(x->x*x*x).reduce(0,(x,y)->(x+y));
        // return    l.stream().filter(Stream01Integer_Tekrar::tekMi).map(x->x*x*x).reduce(Math::addExact);
        return    l.stream().filter(Stream01Integer_Tekrar::tekMi).map(x->x*x*x).reduce(0,Integer::sum);
    }


}
