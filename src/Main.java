public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Сидоренко Алексей Игоревич", 1, 46740);
        employeeBook.addEmployee("Вакуленко Иван Сергеевич", 2, 125560);
        employeeBook.addEmployee("Марченко Георгий Валентинович", 3, 52450);
        employeeBook.addEmployee("Глоба Павел Петрович", 4, 65300);
        employeeBook.addEmployee("Ватрушкина Анна Петровна", 5, 44850);
        employeeBook.addEmployee("Петрова Дарья Александровна", 1, 38500);
        employeeBook.addEmployee("Шевчук Юрий Анатольевич", 2, 101560);
        employeeBook.addEmployee("Яковлев Иван Александрович", 3, 51275);
        employeeBook.addEmployee("Мантуров Глеб Макарович", 4, 48900);
        employeeBook.addEmployee("Башаров Марат Маратович", 5, 89990);

        employeeBook.getEmployeeMinimumSalaryByDepartmentId(2);
        System.out.println();
        System.out.println("Минимальная зарплата в депортаменте " + employeeBook.getEmployeeMinimumSalaryByDepartmentId(2));
        System.out.println();

        employeeBook.getEmployeeMaximumSalaryByDepartmentId(4);
        System.out.println();
        System.out.println("Максимальнпя зарплата в депортаменте " + employeeBook.getEmployeeMaximumSalaryByDepartmentId(4));
        System.out.println();

        employeeBook.getSummOfSalaryOfDepartment(5);
        System.out.println();
        System.out.println("Сумма зарплат отдела " + employeeBook.getSummOfSalaryOfDepartment(5));
        System.out.println();

        employeeBook.getAverageSalaryOfDepartment(3);
        System.out.println();
        System.out.println("Средняя зарплата по отделу " + employeeBook.getAverageSalaryOfDepartment(3));
        System.out.println();

        employeeBook.printAllEmployeesOfDepartment(1);
        System.out.println();

        employeeBook.printAllEmployeesWhithMinSalary(40000);
        System.out.println();

        employeeBook.printAllEmployeesWhithMaxSalary(80000);
        System.out.println();

        employeeBook.getSummOfSalary();
        System.out.println();

        employeeBook.getAverageSalary();
        System.out.println();

        employeeBook.getEmployeeMinimumSalary();
        System.out.println();
        System.out.println("Минимальная зарплата у " + employeeBook.getEmployeeMinimumSalary());

        employeeBook.getEmployeeMaximumSalary();
        System.out.println();
        System.out.println("Максимальная зарплата у " + employeeBook.getEmployeeMaximumSalary());
        System.out.println();

        employeeBook.printAllFullNames();
        System.out.println();

        employeeBook.printAllEmployees();
        System.out.println();

        employeeBook.indexationSalary(10);
        System.out.println();
    }
}