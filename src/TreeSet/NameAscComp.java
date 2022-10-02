package TreeSet;

import java.util.Comparator;

public class NameAscComp implements Comparator<CustomerTreeSet> {
    @Override
    public int compare(CustomerTreeSet o1, CustomerTreeSet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
