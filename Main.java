public class Main {
    public static void main(String[] args){
        Employee Maik = new Employee();
        Maik.setName("Maik");
        Maik.setSalary(10000);
        Maik.Work();

        System.out.println(Maik.getName());
        System.out.println(Maik.getSalary());


        Specialist threeSpec = new Specialist(10);
        threeSpec.setName("Carl");
        threeSpec.setName2("Carlson");
        threeSpec.setName3("Carla");
        threeSpec.setSalary(25000);
        threeSpec.workWithClients();

        System.out.println(threeSpec.getName());
        System.out.println(threeSpec.getName2());
        System.out.println(threeSpec.getName3());
        System.out.println(threeSpec.getLevels());
        System.out.println(threeSpec.getSalary());


        Developer Java = new Developer();
        Java.setGrades("Middle");
        Java.setName("Casa");
        Java.setName2("John");
        Java.setName3("Margaret");
        Java.setName4("Maddison");
        Java.setSalary(30000);
        Java.writeCode();

        System.out.println(Java.getName());
        System.out.println(Java.getName2());
        System.out.println(Java.getName3());
        System.out.println(Java.getName4());
        System.out.println(Java.getSalary());

        Manager Mag = new Manager(true);
        Mag.setName("Mark");
        Mag.setName2("Katcher");
        Mag.setSalary(25000);
        Mag.writeProcedures();

        System.out.println(Mag.getName());
        System.out.println(Mag.getName2());
        System.out.println(Mag.getSalary());

        CEO ceo1 = new CEO(true);
        ceo1.setName("Bruce");
        ceo1.setSalary(30000);
        ceo1.goPublic();

        System.out.println(ceo1.getName());
        System.out.println(ceo1.getSalary());
    }

}
