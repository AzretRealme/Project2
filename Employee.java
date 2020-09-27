public class Employee extends EasyITCompany {
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void Work(){

        System.out.println(" Emloyee" + " Work");

    }
}
