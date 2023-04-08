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

        employeeBook.getSummOfSalary();
        System.out.println();

        employeeBook.getAverageSalary();
        System.out.println();

        employeeBook.getEmployeeMinimumSalary();
        System.out.println();

        employeeBook.getEmployeeMaximumSalary();
        System.out.println();

        employeeBook.printAllFullNames();
        System.out.println();

        employeeBook.printAllEmployees();
        System.out.println();
    }
}