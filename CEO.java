public class CEO extends EasyITCompany {
    private boolean hasCompanyCar = true;
    private String name;
    private double salary;

    public void sethasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public boolean gethasCompanyCar() {
        return hasCompanyCar;
    }

    public CEO(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void goPublic(){
        System.out.println("CEO" + " Work IPO");
    }


}
