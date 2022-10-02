package TreeSet;

import java.util.Comparator;

public class AgeAsCComp implements Comparator<CustomerTreeSet> {


    @Override
    public int compare(CustomerTreeSet o1, CustomerTreeSet o2) {
        return o1.getAge()-o2.getAge();
    }
    
}
