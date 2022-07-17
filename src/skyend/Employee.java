package skyend;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник:" + " " + getName() + " " + "Зарплата:" + " " + getSalary() + " " + "Отдел:" + " " + getDepartment();
    }
}





