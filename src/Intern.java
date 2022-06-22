public class Intern extends Employee {
    private final int MAX_SALARY= 20000;

    public Intern(String name, String surname, int phoneNumber, int salary) {
        super(name, surname, phoneNumber, salary);
        this.updatesalary(salary);
    }
public int getMAX_SALARY(){
    return MAX_SALARY;}

    public void updatesalary(int salary){
        var s = salary > MAX_SALARY ? MAX_SALARY : salary;
        super.setSalary(s);
    }



}

