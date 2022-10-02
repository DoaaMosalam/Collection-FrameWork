package HashMap;

import com.sun.jdi.Value;

import javax.swing.text.html.parser.Entity;
import java.security.Key;
import java.util.*;
import java.util.Scanner;

public class Test {


    public static void Example() {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Jone Doe", 3434.34);
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jana Baker", 1378.00);
        hm.put("Todd Hall", 99.22);
        hm.put("Ralph Smith", -19.08);
        Set<String> sKey = hm.keySet();
//        for (String s:sKey) {
//            System.out.println(s);
//        }
        sKey.forEach(System.out::println);
        System.out.println("=============================================================");
        ArrayList<Double> al = new ArrayList<>(hm.values());
        al.forEach(System.out::println);
        System.out.println("================================================================");
        String name = "Tom Smith";
        System.out.println(hm.get(name));
        System.out.println("================================================");
        Iterator<String> iterator = hm.keySet().iterator();
        String k;
        while (iterator.hasNext()) {
            k = iterator.next();
            System.out.println("Key " + k + " Values " + hm.get(k));
        }
        if (hm.containsKey("Todd Hall")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void MapDemo() {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> mDessertCount = new HashMap<>();
        boolean moreDessert = true;
        do {
            //prompt user for favorite dessert.
            System.out.println("Please,enter your favorite dessert here: ");
            String dessert = input.nextLine().toUpperCase();

            //update dessert count map(Method 1 using put/get/replace).
//           if (!(mDessertCount.containsKey(dessert))){
//               mDessertCount.put(dessert,1);
//           }else {
//               int updateDessert = mDessertCount.get(dessert)+1;
//               mDessertCount.put(dessert,updateDessert);
//               mDessertCount.replace(dessert,updateDessert);
//           }

            //update dessert count map(Method 2 using putIfAbsent/Compute).
//           mDessertCount.putIfAbsent(dessert,0);
//           mDessertCount.compute(dessert,(Key,Value)->++Value);

            //update dessert count map(Method 3 using computeIfAbsent/ComputeIfPresent).
            mDessertCount.computeIfPresent(dessert, (Key, Value) -> ++Value);
            mDessertCount.computeIfAbsent(dessert, (Key) -> 1);

            //print all dessert frequency
            System.out.println("More as a chosen favorite dessert ('Y' or 'N')");
            moreDessert = input.nextLine().toUpperCase().charAt(0) == 'Y';
        } while (moreDessert);
        System.out.println("\n All Desert");
        for (String dessert : mDessertCount.keySet()) {
            System.out.printf("\t%s was as a chosen favorite dessert %s time(s)\n", dessert, mDessertCount.get(dessert));
        }

        //prompt user to get certain dessert
        System.out.println("Please enter dessert to see the number of people who have that dessert as thier favorite. ");
        String dessert = input.nextLine().toUpperCase();
        int count = mDessertCount.getOrDefault(dessert, 0);
        System.out.printf("\t%s individual(s) like %s as their favorite dessert.\n", count, dessert);

        //prompt user remove leat favorite dessert
        System.out.println("\n please enter the dessert you like the least so we can remove it from list: ");
        dessert = input.nextLine().toUpperCase();
        mDessertCount.remove(dessert);

        //print out all dessert w/ frequency ( iterate use iterator)
        System.out.println("\n All Dessert(Update After Remove):");
        Iterator<Map.Entry<String,Integer>> itDessert = mDessertCount.entrySet().iterator();
        while (itDessert.hasNext()){
            Map.Entry<String,Integer> dessertEntry = itDessert.next();
            System.out.printf("\t%s was as a chosen favorite dessert %s time(s)\n", dessertEntry.getKey(), dessertEntry.getValue());
        }
        //make a copy of all dessert and print each Key->Value pair
        Map<String,Integer> mDessertCount2 = new HashMap<>();
        mDessertCount2.putAll(mDessertCount);
        //print out all dessert w/frequency in dessert  copy map(iterator used foreach)
        System.out.println("\n All Desert(Copy): ");
        mDessertCount2.forEach((Key,Value)->System.out.printf("\t%s was as a chosen favorite dessert %s time(s)\n", Key, Value)) ;

    }

    public static void itDessert(Map<String,Integer> map) {
       Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
       while (it.hasNext()){
           Map.Entry<String,Integer> entry = it.next();
           System.out.println(entry.getKey() + "||" + entry.getValue());
       }
    }
}
