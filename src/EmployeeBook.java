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

    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public void getSummOfSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum + " рублей.");
    }

    public void getEmployeeMinimumSalary() {
        Employee employee = employees[0];
        double minSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + anyEmployee);
            }
        }
    }
}
