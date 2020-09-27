public class Specialist extends EasyITCompany {
    private int levels;
    private double salary;
    private String name;
    private String name2;
    private String name3;

    public Specialist() {

    }
    public Specialist(int levels) {

        this.levels = levels;
    }

    public int getLevels() {

        return levels;
    }

    public void setLevels(int levels) {

        this.levels = levels;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName2() {

        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void workWithClients(){
        System.out.println("Specialist " + " workWithClients ");
    }
}
