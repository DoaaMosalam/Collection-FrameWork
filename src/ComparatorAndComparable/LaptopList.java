package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopList {
    public static void print(ArrayList<Laptop> list){
        for (int i=0;i<list.size();i++){
            System.out.printf("%d | ",list.get(i));
        }
    }
    public static void laptop(){
        List<Laptop> lap = new ArrayList<>();
        lap.add((new Laptop("Dell",6,700)));
        lap.add((new Laptop("Apple",3,1200)));
        lap.add(new Laptop("Acer",5,600));
        lap.add(new Laptop("Hp",8,900));
        lap.add(new Laptop("Lenovo",4,400));
//        Comparator<Laptop> la = new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//                return o1.getPrice() - o2.getPrice();
//            }
//        };


        Collections.sort(lap);
        for (Laptop l: lap) {
            System.out.println(l);
        }
    }

}
