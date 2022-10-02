package HashSet;
import java.util.*;

public class EmployeeHashSet {
    public static void Show() {
        Set<Employee> list = new HashSet<>();
        list.add(new Employee("Doaa Mosalam",29,2269,"Doaa.Mosalam9@gmail.com"));
        list.add(new Employee("Ahmed Mohammed",33,3500,"Ahmed.Mohameed@gmail.com"));
        list.add(new Employee("Fatma Sayed",55,5500,"Fatma.Sayed@gmail.com"));
        list.add(new Employee("Sayed Mosalam",60,7500,"Sayed.Mosalam@gmail,com"));
        list.add(new Employee("Mahmoud saad",25,2000,"Mahmoud.Saad@gmail.com"));
        list.add(new Employee("Mousa Ahmed",28,4370,"Mousa.Ahmed@gmail.com"));
        list.add(new Employee("Fatma Sayed",55,5500,"Fatma.Sayed@gmail.com"));
      //  printList(list);
    }
    public static void printList(Set set){
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

}
