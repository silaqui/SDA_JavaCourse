package workers;

/**
 * Created by Miki on 18.02.2017.
 */
public  class AbstractEmployee  {


    protected String firstName;
    protected String lastName;
    protected double salary;
    protected String department;


    public AbstractEmployee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "[ " +
                firstName +
                ", " + lastName +
                ", " + salary +
                ", " + department +
                " ]";
    }
}
