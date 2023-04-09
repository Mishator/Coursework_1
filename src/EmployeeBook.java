public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String FIO, int department, double salary) {
        if (size >= employees.length) {
            throw new IllegalArgumentException("Нельзя добавить сотрудника, закончилось место.");
        }
        Employee newEmployee = new Employee(FIO, department, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void getSummOfSalary() {
        double sum = 0;
        for (Employee employee : employees) {
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

    public void getEmployeeMaximumSalary() {
        Employee employee = employees[0];
        double maxSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + anyEmployee);
            }
        }
    }

    public void getAverageSalary() {
        double sum = 0;
        double averageSalary;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        averageSalary = sum / employees.length;
        System.out.println("Среднее значение зарплат составляет: " + averageSalary + " рублей.");
    }
    public void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }
}
