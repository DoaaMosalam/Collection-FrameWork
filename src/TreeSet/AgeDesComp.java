package TreeSet;

import java.util.Comparator;

public class AgeDesComp implements Comparator<CustomerTreeSet> {
    @Override
    public int compare(CustomerTreeSet o1, CustomerTreeSet o2) {
        return o2.getAge()-o1.getAge();
    }
}
