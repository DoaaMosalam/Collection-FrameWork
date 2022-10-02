package com.company;

import HashSet.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeIteratorTest {
    public static void printArrayList(List<Employee> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void test() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Doaa Mosalam", 29, 2269, "dodoo_mosalam@yahoo"));
        empList.add(new Employee("Ahmed Mohammed", 30, 1200, "Ahmed@gmail.com"));
        empList.add(new Employee("Mahmoud Sayed", 34, 3500, "Mahmoud@gamil.com"));
        empList.add(new Employee("Adam Amr", 21, 3300, "Adam@gamil.com"));
        empList.add(new Employee("Fatma Sayed", 60, 5000, "fatma@gamil.com"));

//        iteratorListUsingListIterator(empList);
//        System.out.println("========================================================================");
//        addElementInListIterator(empList);
//        System.out.println("=======================================================================");
 //       deleteElementInListUsingListIterator(empList);
        System.out.println("============================================================================");
//        replaceElementInListUsingListIterator(empList);
        System.out.println("==============================================================================");

//        Iterator<Employee> iter = empList.iterator();
//        while (iter.hasNext()){
//            Employee employee = iter.next();
//            if (employee.getSalary()>4000)
//                iter.remove();
//        }
        Iterator<Employee> iterator = empList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
    public static void iteratorListUsingListIterator(List<Employee> empList){
       ListIterator<Employee> listIterator = empList.listIterator();
        System.out.println("Forward direction:::");
        while (listIterator.hasNext()){
            Employee employee=listIterator.next();
            System.out.println(employee);
        }
        System.out.println("BackWard direction:::");
        while (listIterator.hasPrevious()){
            Employee employee = listIterator.previous();
            System.out.println(employee);
        }
    }

    public static void addElementInListIterator(List<Employee> empList){
        ListIterator<Employee> listIterator1 = empList.listIterator();
        while (listIterator1.hasNext()){
            Employee employee = listIterator1.next();
            if (!employee.getName().equalsIgnoreCase("Asmaa"));
            listIterator1.add(new Employee("Asmaa",33,4500,"asmaa@gmail.com"));
            break;
        }
        for (Employee employee :empList) {
            System.out.println(employee);
        }
    }

    public static void deleteElementInListUsingListIterator(List<Employee>empList) {
        ListIterator<Employee> listIterator = empList.listIterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            if (employee.getName().equalsIgnoreCase("Doaa Mosalam")) {
                listIterator.remove();
            }
        }
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }

        public static void replaceElementInListUsingListIterator(List<Employee>empList){
        ListIterator<Employee> listIterator = empList.listIterator();
        while (listIterator.hasNext()){
            Employee employee = listIterator.next();
            if (employee.getName().equalsIgnoreCase("Doaa Mosalam"));
            employee.setName("Sayed Mosalam");
            listIterator.set(employee);
        }
            for (Employee employee:empList) {
                System.out.println(employee);
            }

        }



}
