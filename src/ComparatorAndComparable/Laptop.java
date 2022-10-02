package ComparatorAndComparable;

import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {
    private String name;
    private int ram;
    private int price;

    //    public Laptop(){
//    }
    public Laptop(String n, int r, int p) {
        this.name = n;
        this.ram = r;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram='" + ram + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop) {
        int myRam = this.getRam();
        int laRam = laptop.getRam();
        return myRam - laRam;
//        if (this.getRam()>laptop.getRam())
//            return 1;
//        else
//            return -1;
    }
//    Comparator<Laptop> AssendingPrice = new Comparator<Laptop>() {
//        @Override
//        public int compare(Laptop o1, Laptop o2) {
//            if (o1.getPrice()>o2.getPrice())
//            return 1;
//            else
//                return -1;
//        }
//    };

//    Comparator<Laptop> DescendingPrice = new Comparator<Laptop>() {
//        @Override
//        public int compare(Laptop o1, Laptop o2) {
//            return o2.getPrice()-o2.getPrice();
//        }
//    };

}
