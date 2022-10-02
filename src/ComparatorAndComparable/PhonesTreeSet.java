package ComparatorAndComparable;

import java.util.Comparator;
import java.util.Objects;

public class PhonesTreeSet implements Comparable<PhonesTreeSet> {
    private String name;
    private int model;
    private int price;

    public PhonesTreeSet(String name, int model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhonesTreeSet{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}' + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhonesTreeSet)) return false;
        PhonesTreeSet that = (PhonesTreeSet) o;
        return getModel() == that.getModel() &&
                getPrice() == that.getPrice() &&
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice());
    }

    @Override
    public int compareTo(PhonesTreeSet o) {
        int n = this.getName().compareTo(o.getName());
        return n;
    }

//    Comparator<PhonesTreeSet> AcendingModel = new Comparator<PhonesTreeSet>() {
//        @Override
//        public int compare(PhonesTreeSet o1, PhonesTreeSet o2) {
//            return o1.getModel() - o2.getModel();
//        }
//    };
//
//    Comparator<PhonesTreeSet> AscendingPrice = new Comparator<PhonesTreeSet>() {
//        @Override
//        public int compare(PhonesTreeSet o1, PhonesTreeSet o2) {
//            return o1.getPrice() - o2.getPrice();
//        }
//    };
//    Comparator<PhonesTreeSet>decendingModel = new Comparator<PhonesTreeSet>() {
//        @Override
//        public int compare(PhonesTreeSet o1, PhonesTreeSet o2) {
//            return o2.getModel()-o2.getModel();
//        }
//    };
//    Comparator<PhonesTreeSet> decendingPrice = new Comparator<PhonesTreeSet>() {
//        @Override
//        public int compare(PhonesTreeSet o1, PhonesTreeSet o2) {
//            return o2.getPrice()-o1.getPrice();
//        }
//    };
}
