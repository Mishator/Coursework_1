public class Employee {
    private String FIO;
    private int Department;
    private double Salary;
    private static int id;

    public Employee(String FIO, int department, double salary) {
        this.FIO = FIO;
        this.Department = department;
        this.Salary = salary;
        id = counter++;
    }
}
