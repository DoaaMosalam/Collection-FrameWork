package HashMap;

import java.util.*;

public class Nationalites {
    public static void list(){
       List<String> nationalities = new ArrayList<>();
        nationalities.add("Kuwait");
        nationalities.add("Sa");
        nationalities.add("Kuwait");
        nationalities.add("Sa");
        nationalities.add("UAE");
        nationalities.add("UAE");
        nationalities.add("Kuwait");
        nationalities.add("Dubai");
        nationalities.add("Oman");
        nationalities.add("Dubai");

        HashMap<String,Integer> allMap = new HashMap<>();
        for (int i = 0; i <nationalities.size() ; i++) {
            String place = nationalities.get(i);
            if (!(allMap.keySet().contains(place))){
                allMap.put(place,1);
            }else {
                allMap.put(place,allMap.get(place)+1);
            }
        }
        System.out.println(allMap);
        System.out.println("---------------------------------------------------------");
        TreeMap<String,Integer> treeMap = new TreeMap<>(allMap);
        System.out.println(treeMap);
    }
}
