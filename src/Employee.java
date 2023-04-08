public class Employee {

    private final String nameEmployee;
    private int department;
    private double salary;
    private static int id;
    private final int numId;

    public Employee(String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
        id ++;
        this.numId = getId();
    }
    private static int getId() {
        return id;
    }
    public int getNumId() {
        return numId;
    }
    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + getNumId() + " Имя: " + getNameEmployee() + " Департамент: "
                + getDepartment() + " Зарплата: " + getSalary();
    }
}
