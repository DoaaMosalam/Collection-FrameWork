package TreeSet;

import java.util.*;

public class CustomerList {
    public static void list(){
        TreeSet<CustomerTreeSet> list = new TreeSet<CustomerTreeSet>(new AgeAsCComp());
        list.add(new CustomerTreeSet("Ahmed Mohammed",30));
        list.add(new CustomerTreeSet("Mohammed Mahmoud",66));
        list.add(new CustomerTreeSet("Horia Saad", 25));
        list.add(new CustomerTreeSet("Doaa Mosalam",29));
        print(list);
        System.out.println("==========================================================");
//        TreeSet<CustomerTreeSet> value = new TreeSet<CustomerTreeSet>(new NameAscComp());
//        value.addAll(list);
//        System.out.println("Sort list by name ascending");
//        print(value);
//        TreeSet<CustomerTreeSet> ageD = new TreeSet<CustomerTreeSet>(new AgeDesComp());
//        ageD.addAll(list);
//        System.out.print("Sort list by age descending");
//        print(ageD);
        AddElement(list);
    }

    public static void print(TreeSet set){
        Iterator<CustomerTreeSet> iterator = set.iterator();
        while (iterator.hasNext()){
            CustomerTreeSet customer = iterator.next();
            System.out.println(customer);
        }
    }

    public static void AddElement(TreeSet set){
        Iterator<CustomerTreeSet> iterator = set.iterator();
        while (iterator.hasNext()){
            CustomerTreeSet customer =iterator.next();
            if (customer.getAge()>=60) {
                set.remove(customer);
            }

        }
        Iterator<CustomerTreeSet> itr = set.iterator();
        while (itr.hasNext()){
            CustomerTreeSet cc = itr.next();
            System.out.println(cc);
        }
        System.out.println("First Element:"+ set.first());
    }


}
