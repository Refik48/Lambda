package fonksiyonel;

import java.util.Arrays;
import java.util.List;

public class Lambda01Kurallar_Tekrar {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,2,3,4,5);
        liste.forEach(x->System.out.print(x));
        System.out.println("\n=============================");
        liste.forEach(t-> System.out.print(t+2 + " "));
        System.out.println("\n=============================");
        liste.forEach(t-> {
                int miktar = 2;
                System.out.print(t+miktar+ " ");
        });
        System.out.println("\nVeri tipi kullanilirsa Explicit");
        liste.forEach((Integer x) -> System.out.print(x*2 + " "));

        System.out.println("\n Dis degisken kullanabilirmiyiz");
        int deger = 5;
        liste.forEach(t-> System.out.print(t+deger + " "));
        System.out.println("\n Methot referans kullanimi");
        liste.forEach(System.out::print);
        System.out.println("\n Methot referans kullanimi-2");
        liste.forEach(Lambda01Kurallar_Tekrar::yazdir);

    }
    public static void yazdir(int x){
        System.out.println(x + " ");
    }
}
