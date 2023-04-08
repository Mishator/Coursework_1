public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String FIO, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место.");
        }
        Employee newEmployee = new Employee(FIO, department, salary);
        employees[size++] = newEmployee;
    }
}
