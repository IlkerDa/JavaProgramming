package day37_Inheritance.scrumTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    } //Tester IS A Employee,  Tester IS A Person

    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");

    }

}
