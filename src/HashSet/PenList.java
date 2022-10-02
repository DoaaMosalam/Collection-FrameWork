package HashSet;
import java.util.*;

public class PenList {
    public static void list(){
        Set<Object> list = new HashSet<>();
        list.add(new Pen("BMW","Red",34.432,6000000));
        list.add(new Pen("Porsh","Blue",432.432,9000000));
        list.add(new Pen("Hunda","White",72.324,350000));
        list.add(new Pen("Chevrolet","Yellow",3442.424,490000));
        list.add(new Pen("Ford","While",342.324,550000));
        list.add(new Pen("Suzuki","Purple",34.432,130000));
        list.add(new Pen("Suzuki","Purple",34.432,130000));
       // printList(list);
        System.out.println(list.size());
        print(list);
        System.out.println("-================================================================");
        removeElement(list);
    }

    public static void printList(Set set){
        Iterator<Pen> iterator = set.iterator();
        while (iterator.hasNext()){
            Pen pen = iterator.next();
            System.out.println(pen);
        }
    }

    public static void print (Set set){
        for (Object i:set){
            System.out.println(i);
        }
    }

    public static void removeElement(Set set){
        Iterator<Pen> iterator = set.iterator();

        while (iterator.hasNext()){
            Pen pen = iterator.next();
            if (pen.getPrice()>=1000000)
                iterator.remove();
        }
        Iterator<Pen> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Pen pen = iterator1.next();
            System.out.println(pen);
        }
    }


}
