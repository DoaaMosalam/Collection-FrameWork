package ComparatorAndComparable;

import java.util.*;

public class AscendingModel implements Comparator<PhonesTreeSet> {
    @Override
    public int compare(PhonesTreeSet o1, PhonesTreeSet o2) {
       if (o1.getModel()>o2.getModel())
           return 1;
       else
           return -1;
    }


}
