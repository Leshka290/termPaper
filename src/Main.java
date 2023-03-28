public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Max", 1, 60000));
        employeeBook.addEmployee(new Employee("Spoke", 4, 90000));
        employeeBook.addEmployee(new Employee("Dave", 1, 50000));
        employeeBook.addEmployee(new Employee("Meg", 2, 120000));
        employeeBook.addEmployee(new Employee("Sten", 5, 50000));
        employeeBook.addEmployee(new Employee("Ben", 3, 140000));
        employeeBook.addEmployee(new Employee("Sam", 2, 120000));
        employeeBook.getInfoEmployee();
        employeeBook.monthlySalary();
        employeeBook.deleteEmployee(1);
        employeeBook.deleteEmployee("Ben");
        employeeBook.addNewEmployee(new Employee("Mary", 2, 19000));
        employeeBook.addNewEmployee(new Employee("Sysan", 3, 195000));
        employeeBook.addNewEmployee(new Employee("Kary", 1, 133000));
        employeeBook.addNewEmployee(new Employee("Stiven", 2, 422000));
        employeeBook.addNewEmployee(new Employee("Martin", 2, 422000));
        employeeBook.addNewEmployee(new Employee("Fred", 2, 422000));
        employeeBook.getInfoEmployee();
        employeeBook.minEmployeeSalary();
        employeeBook.maxEmployeeSalary();
        employeeBook.averageSalary();
        employeeBook.employeeData();
        employeeBook.indexSalary(100);
        employeeBook.monthlySalary();
        employeeBook.minEmployeeSalaryDep(3);
        employeeBook.maxEmployeeSalaryDep(3);
        employeeBook.monthlySalaryDep(3);
        employeeBook.averageSalaryDep(3);
        employeeBook.indexSalaryDep(100, 3);
        employeeBook.employeeDataDep(3);
        employeeBook.salaryLessThan(201000);
        employeeBook.salaryMoreThan(201000);
        employeeBook.changeEmployee("Kary");
        employeeBook.employeeDataDep(2);
        employeeBook.informationEmployees();
        employeeBook.howManyDepartments();
    }
}