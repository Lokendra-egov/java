public class Engineer extends Employee{
    double benefits;
    public Engineer(String name, double BaseSalary, double Gratuity, long joiningDate, double benefits){
        super(name,BaseSalary,Gratuity,joiningDate);
        this.benefits = benefits;
    }

    @Override
    public void displayTotalSalary() {
        double TotalSalary = BaseSalary + Gratuity + benefits;
        System.out.println("Total salary is "+TotalSalary+ " per month");
    }

    @Override
    public void displayEmpRole() {
        System.out.println("I am an instance of type engineer, I build stuff!");
    }
}