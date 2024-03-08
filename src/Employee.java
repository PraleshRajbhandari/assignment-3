public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        return salary + salary * percent/100;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
}
