package HashSet;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String mail;

//    public EmployeeIterator() {
//    }

    public Employee(String n, int a, double s, String m) {
        this.name = n;
        this.age = a;
        this.salary = s;
        this.mail = m;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary1) {
        this.salary = salary1;
    }

    public double getSalary() {
        return salary;
    }

    public void setMail(String mail1) {
        this.mail = mail1;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {

        return "Employee [Name:" + name +
                ",Age:" + age +
                ",Mail:" + mail +
                "Salary: " + salary;
    }

}
