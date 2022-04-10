package day35_Encapsulation.encapsulation;

public class Person {

    private String name; // we encapsulated the variable by doing private
    private int age; // var. public olursa kontrol edemeyiz, private ise istedigimiz gibi kontrol ederiz

    public String getName(){
        return name;
    } //getter

    public void setName(String name){
        this.name = name;
    } // setter

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<=0 || age>150){
            System.err.println("Invalid age: "+ age);
            System.exit(0);
        }
        this.age = age;
    }

}
