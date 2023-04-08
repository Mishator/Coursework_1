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

    public int getId() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public double getSalary() {
        return this.Salary;
    }
}
