package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream03Integer_Tekrar {
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
        liste.add(-1);
        liste.add(15);
        liste.add(500);
        liste.add(-15);
        System.out.println("En BUYUK DEGER:" + buyukBul(liste));
        System.out.println("En BUYUK DEGER:" + buyukBul1(liste));
        System.out.println("En BUYUK DEGER:" + buyukBul2(liste));
        System.out.println("En BUYUK DEGER:" + kucukBul(liste));
        System.out.println("En BUYUK DEGER:" + carpimBul(liste));
        System.out.println("9 sayisi:" + dokuzSay(liste));

    }
    public static int buyukBul(List<Integer> liste){
        return liste.stream().reduce(0,(x,y) -> x>y ? x:y);
    }
    public static int buyukBul1(List<Integer> liste){
        return liste.stream().reduce(0,Math::max);
    }
    public static int buyukBul2(List<Integer> liste){
        return liste.stream().sorted().reduce(0,(x,y)->y);
    }
   public static int kucukBul(List<Integer> liste){
        return liste.stream().sorted().reduce(0,(x,y)-> x<y ? x:y);
    }
    public static int carpimBul(List<Integer> liste){
        return liste.stream().reduce(1,(x,y) -> x*y);

    }
    public static int dokuzSay(List<Integer> liste){
        return (int) liste.stream().filter(x-> x==9).count();
    }

}
