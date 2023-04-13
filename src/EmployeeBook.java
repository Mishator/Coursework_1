public class EmployeeBook {
    private static Employee[] employees;
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

    public void indexationSalary(int percent) {
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
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

    public Employee getEmployeeMinimumSalary() {
        Employee minEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minEmployee.getSalary()) {
                minEmployee = employees[i];
            }

        }
        return minEmployee;
    }


    public Employee getEmployeeMaximumSalary() {
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
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

    public static Employee getEmployeeMinimumSalaryByDepartmentId(int departmentId) {
        int minSalary = Integer.MAX_VALUE;
        Employee getEmployeeMinimumSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                getEmployeeMinimumSalary = employee;
            }
        }
        return getEmployeeMinimumSalary;
    }

    public static Employee getEmployeeMaximumSalaryByDepartmentId(int departmentId) {
        int maxSalary = Integer.MIN_VALUE;
        Employee getEmployeeMaximumSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                getEmployeeMaximumSalary = employee;
            }
        }
        return getEmployeeMaximumSalary;
    }
}