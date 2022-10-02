package HashSet;

import java.util.Objects;

public class Pen {
    private String car;
    private String color;
    private double volume;
    private long price;

//    public Pen(){
//    }
    public Pen(String c,String col,double v,long p){
        this.car=c;
        this.color=col;
        this.volume=v;
        this.price=p;
    }
    public void setCar(String car1){
        this.car = car1;
    }
    public void setColor(String color1){
        this.color=color1;
    }
    public void setVolume(double volume1){
        this.volume=volume1;
    }
    public void setPrice(long price1){
        this.price=price1;
    }
    public String getColor() {
        return color;
    }
    public double getVolume() {
        return volume;
    }
    public long getPrice() {
        return price;
    }
    public String getCar(){
        return car;
    }

    //    public boolean equal(Object o){
//        if (o==null)return false;
//        if (o==this)return true;
//        if (!(o instanceof Pen))return false;
//        Pen oo = (Pen) o;
//        if (this.color.equals(oo.color)&&this.volume==oo.volume
//          && this.car.equals(oo.car)&& this.price==oo.price){
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen oP = (Pen) o;
        return Double.compare(oP.getVolume(), getVolume()) == 0 &&
                getPrice() == oP.getPrice() &&
                getCar().equals(oP.getCar()) &&
                getColor().equals(oP.getColor());
    }

//    public int hashCode(){
//        Double d =(volume);
//        return d.hashCode() + color.hashCode();
//    }


    @Override
    public int hashCode() {
        return Objects.hash(getCar(), getColor(), getVolume(), getPrice());
    }

    @Override
    public String toString() {
        return "Pen{" +
                "car='" + car + '\'' +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
