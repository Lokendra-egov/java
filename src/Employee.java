public class Employee{
    String name;
    double BaseSalary;
    double Gratuity;
    long JoiningDate;

    public Employee(String name, double BaseSalary, double Gratuity, long joiningDate){
        this.name = name;
        this.BaseSalary = BaseSalary;
        this.Gratuity = Gratuity;
        this.JoiningDate = joiningDate;
    }

    public void displayTotalSalary(){
        double TotalSalary = BaseSalary + Gratuity;
        System.out.println("Total salary is " +TotalSalary+ "per month");
    }
    public void displayEmpRole(){
        System.out.println("I am an instance of the type Employee, I can do anything!");
    }
}
