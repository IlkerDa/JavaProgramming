package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;  // private means you own data/variable kontrol
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            // System.err.println("Invalid data");   eger error mesaji eklersen system exit YAP!
            // System.exit(0);
            return;     //YA DA dadece return YAP ki funktiondan ciksin
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            return;   // exit the function
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 16 || age > 99) {
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
