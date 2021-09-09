package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream04String_Tekrar {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("alihano");
        liste.add("Mariano");
        liste.add("alberto");
        liste.add("Alonzo");
        liste.add("Tucker");
        liste.add("Alfonso");
        liste.add("Christ");
        aIleBaslayanlar(liste);
        System.out.println("================================");
        buyukHarfeCevir(liste);
        System.out.println("================================");
        uzunlugaGoreSiralaKucult(liste);
        System.out.println("================================");
        uzunlugaGoreYazdir(liste,5);
        System.out.println("================================");
        System.out.println("Tum elemanlar belitilen degerden kucuk:" + uzunlukKucukMu(liste,9));
        System.out.println("================================");
        System.out.println("BASLAYAN YOK MU : " + baslamayanHarfVarMi(liste,"A"));
        System.out.println("================================");
        System.out.println("HERHANGI BITEN HARF VAR MI: " + herhangiBitenVarMi(liste,"c") );
        System.out.println("================================");
         aIleOYazdir(liste);
        System.out.println("================================");
    }
    public static void aIleBaslayanlar(List<String> liste){
        liste.stream().filter(h->h.startsWith("A")).forEach(System.out::println);
    }
   public static void buyukHarfeCevir(List<String> liste){
       liste.stream().map(h -> h.toUpperCase()).forEach(System.out::println);
    }
    public static void uzunlugaGoreSiralaKucult (List<String> liste){
        liste.stream().
                sorted(Comparator.comparing(t -> t.length())).
                map(t ->t.toLowerCase()).
                forEach(System.out::println);
    }
    public static void uzunlugaGoreYazdir(List<String> liste , int uzunluk){
        liste.stream().filter(t ->t.length() > uzunluk).forEach(System.out::println);
    }
    public static boolean uzunlukKucukMu (List<String> liste,int uzunluk){
      return   liste.stream().allMatch(t -> t.length()< uzunluk);
    }
    public static boolean baslamayanHarfVarMi(List<String> liste,String harf){
        return liste.stream().noneMatch(t->t.startsWith(harf));
    }
    public static boolean herhangiBitenVarMi(List<String> liste,String harf){
       return liste.stream().anyMatch(t->t.endsWith(harf));
    }
    public static void aIleOYazdir (List<String> liste){
        liste.stream().
                filter(t->t.startsWith("A") && t.endsWith("o")).
                forEach(System.out::println);
    }
    public static void listeleYazdir(List<String> liste){
       liste.stream().sorted().map().forEach();

    }


}


