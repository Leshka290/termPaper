import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EmployeeBook {
    private int n = 7;
    private Employee[] repository = new Employee[n];

    public void addEmployee(Employee employee) {
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] == null) {
                repository[i] = employee;
                return;
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] == null) {
                repository[i] = employee;
                return;
            }
        }
        n++;
        repository = Arrays.copyOf(repository, n);
        repository[n - 1] = employee;
    }

    public void deleteEmployee(String name) {
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] != null && name.equals(repository[i].getNameEmployee())) {
                repository[i] = null;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < repository.length; i++) {
            if (id == repository[i].getNumId()) {
                id = repository[i].getNumId();
                repository[i] = null;
            }
        }
    }

    public void changeEmployeeSalary(String name, int newSalary) {
        for (Employee employee : repository) {
            if (employee.getNameEmployee().equals(name)) {
                employee.setSalary(newSalary);
            }
        }
    }
    public void changeEmployeeDepartment(String name, int newDepartment) {
        for (Employee employee : repository) {
            if (employee.getNameEmployee().equals(name)) {
                employee.setDepartment(newDepartment);
            }
        }
    }

    public int howManyDepartments() {
        int max = Integer.MIN_VALUE;

        for (Employee employee : repository) {
            max = Math.max(max, employee.getDepartment());
        }
        return max;
    }

    public void informationEmployees() {
        for (int i = 0; i < howManyDepartments(); i++) {
            System.out.println("Информация об отделе " + (i + 1) + " : ");
            for (Employee employee : repository) {
                if (employee.getDepartment() == i + 1) {
                    System.out.println("id: " + employee.getNumId() + " Имя: " + employee.getNameEmployee()
                            + " Зарплата: " + employee.getSalary());
                }
            }
        }
    }

    public void getInfoEmployee() {
        for (Employee employee : repository) {
            System.out.println(employee.toString());
        }
    }

    public double monthlySalary() {
        double monSalary = 0;

        for (Employee employee : repository) {
            monSalary += employee.getSalary();
        }
        System.out.println("monSalary " + monSalary);
        return monSalary;
    }

    public double minEmployeeSalary() {
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : repository) {
            minSalary = Math.min(minSalary, employee.getSalary());
        }
        System.out.println(minSalary);
        return minSalary;
    }

    public double maxEmployeeSalary() {
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : repository) {
            maxSalary = Math.max(maxSalary, employee.getSalary());
        }
        System.out.println(maxSalary);
        return maxSalary;
    }

    public double averageSalary() {
        double avgSalary = 0;

        avgSalary = monthlySalary() / repository.length;
        System.out.printf("%.2f\n", avgSalary);
        return avgSalary;
    }

    public void employeeData() {
        for (Employee employee : repository) {
            System.out.println(employee.getNameEmployee());
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : repository) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * index));
        }
    }

    public double minEmployeeSalaryDep(int department) {
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                minSalary = Math.min(minSalary, employee.getSalary());
            }
        }
        System.out.println("minSalaryDep " + minSalary);
        return minSalary;
    }

    public double maxEmployeeSalaryDep(int department) {
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                maxSalary = Math.max(maxSalary, employee.getSalary());
            }
        }
        System.out.println("maxSalaryDep " + maxSalary);
        return maxSalary;
    }

    public double monthlySalaryDep(int department) {
        double monSalaryDep = 0;

        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                monSalaryDep += employee.getSalary();
            }
        }
        System.out.println("monSalaryDep " + monSalaryDep);
        return monSalaryDep;
    }

    public double averageSalaryDep(int department) {
        double avgSalary = 0;
        int numEmployee = 0;

        for (Employee employee : repository) {
            if (employee.getDepartment() == department)
                numEmployee++;
        }
        avgSalary = monthlySalaryDep(department) / numEmployee;
        System.out.println("avgSalaryDep " + avgSalary);
        return avgSalary;
    }

    public void indexSalaryDep(int index, int department) {
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * index));
            }
        }
        System.out.println();
    }

    public void employeeDataDep(int department) {
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                System.out.println("id: " + employee.getNumId() + " Имя: " + employee.getNameEmployee()
                        + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public void salaryLessThan(int number) {
        for (Employee employee : repository) {
            if (number > employee.getSalary()) {
                System.out.println("id: " + employee.getNumId() + " Имя: " + employee.getNameEmployee()
                        + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public void salaryMoreThan(int number) {
        for (Employee employee : repository) {
            if (number <= employee.getSalary()) {
                System.out.println("id: " + employee.getNumId() + " Имя: " + employee.getNameEmployee()
                        + " Зарплата: " + employee.getSalary());
            }
        }
    }
}
