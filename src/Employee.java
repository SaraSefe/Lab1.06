public class Employee {
    private String name;
    private String surname;
    private int phoneNumber;
    private int salary;

    public Employee(String name, String surname, int phoneNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return """
                    Name: %s
                    Surname : %s
                    Salary: %d
                
                    
                    ============
                """.formatted(
                getName(),
                getSurname(),
                getSalary()

        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

