package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream02Integer  {

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
        tekKareYazdir(liste);
    }

    public static void tekKareYazdir(List<Integer> l){
        l.stream().filter(Stream01Integer::tekMi).map(x->x*x).forEach(Stream01Integer::yazdır);
    }

    public static Integer tekKupToplami(List <Integer> l){
        //  return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(0,(x,y)-> (x+y));
        //  return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(Math::addExact);
        return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(0, Integer::sum);

    }



}
