public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, This is Loki");
        Employee seniorSoftware = new Employee("Loki",100000,50000,19062018);
        seniorSoftware.displayTotalSalary();
        seniorSoftware.displayEmpRole();

        Engineer SoftwareEngineer = new Engineer("Loki",100000,50000,19062018,20000);
        SoftwareEngineer.displayTotalSalary();
        SoftwareEngineer.displayEmpRole();
    }

}