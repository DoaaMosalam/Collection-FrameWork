package TreeSet;

import java.util.Comparator;

public class   NameDesComp implements Comparator<CustomerTreeSet> {
    @Override
    public int compare(CustomerTreeSet o1, CustomerTreeSet o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
