package streamOrnekler;
import java.util.ArrayList;
import java.util.List;

public class Stream03Integer {
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


    }
    public static int buyukBul(List<Integer> liste){
        return liste.stream().reduce(0, (x,y)-> x >y ? x:y);
    }
    public static int buyukBul1(List<Integer> liste){
        return liste.stream().reduce(0,Math::max);
    }


}
