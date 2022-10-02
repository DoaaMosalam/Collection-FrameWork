package ComparatorAndComparable;

import java.util.*;

public class PhonesList {

    public static void ListPhone() {
        TreeSet<PhonesTreeSet> list = new TreeSet<>(new AscendingModel());
        list.add(new PhonesTreeSet("Samsumn", 2010, 4500));
        list.add(new PhonesTreeSet("Iphone", 2021, 30000));
        list.add(new PhonesTreeSet("Sony", 2000, 3500));
        list.add(new PhonesTreeSet("Redmi", 2020, 2000));
        System.out.print(list);

    }

    public static void ListHashSet() {
        Set<PhonesTreeSet> lst = new HashSet<PhonesTreeSet>();
        lst.add(new PhonesTreeSet("Samsumn", 2010, 4500));
        lst.add(new PhonesTreeSet("Iphone", 2021, 30000));
        lst.add(new PhonesTreeSet("Sony", 2000, 3500));
        lst.add(new PhonesTreeSet("Redmi", 2020, 2000));

        lst.forEach(System.out::println);

    }
}
