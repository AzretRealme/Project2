public class Manager extends EasyITCompany {
    private String name;
    private String name2;
    private boolean hasStocks = true;
    private double salary;

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public boolean getHasStocks() {
        return hasStocks;
    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
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

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void writeProcedures(){
        System.out.println("Managers " + " WriteProcedures");
    }
}

