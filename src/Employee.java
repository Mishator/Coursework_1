public class Employee {
    private String FIO;
    private int Department;
    private double Salary;
    private int id;
    private static int counter = 1;

    public Employee(String FIO, int department, double salary) {
        this.FIO = FIO;
        this.Department = department;
        this.Salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
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

    public void setDepartment(int department) {
        if (department > 0) {
            this.Department = department;
        } else System.out.println("Ошибка! Номер отдела должен быть положительным числом!");
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.Salary = salary;
        } else System.out.println("Ошибка! Зарплата должна быть положительным числом!");
    }

    public String toString() {
        return "ФИО сотрудника: " + FIO + ". Отдел №" + Department + ". Зарплата: " + Salary + ". Идентификационный номер: " + id;
    }


}
