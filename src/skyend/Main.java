package skyend;

import java.util.Arrays;

public class Main {
    public static void allEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static int allSalary(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        System.out.println("Общая сумма зарплат составляет:" + sum);

        return sum;
    }


    public static void averageSalary(Employee[] employee) {
        int averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            averageSalary += employee[i].getSalary() / employee.length;
        }
        System.out.println("Средняя зарплата составляет:" + averageSalary);

    }

    public static void minSalary(Employee[] employee) {
        Employee min = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (min.getSalary() > employee[i].getSalary())
                min = employee[i];
        }
        System.out.println("Минимальная затрата сотрудника:" + " " + min.getSalary() + "у" + " " + min.getName());
    }

    public static void maxSalary(Employee[] employee) {
        Employee max = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (max.getSalary() < employee[i].getSalary())
                max = employee[i];
        }
        System.out.println("Максимальная затрата сотрудника:" + " " + max.getSalary() + "у" + " " + max.getName());
    }

    public static void allName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("И.Ф.О. сотрудника:" + employee[i].getName());
        }
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Прокопенко Роман Сергеевич", 2, 65000);
        employee[1] = new Employee("Иванов Андрей Викторович", 3, 55000);
        employee[2] = new Employee("Изотов роман Сергеевич", 1, 89000);
        employee[3] = new Employee("Коротких Семен Андреич ", 1, 93000);
        employee[4] = new Employee("Смирнов Артур Михайлович", 2, 86000);
        employee[5] = new Employee("Новиков Константин Иванович", 4, 73000);
        employee[6] = new Employee("Кроткин Александр Эдуардович", 2, 65000);
        employee[7] = new Employee("Шкрильняк Андрей Петрович", 3, 68000);
        employee[8] = new Employee("Сибогатов Игорь Романович", 4, 49000);
        employee[9] = new Employee("Капроизов Артём Александрович", 5, 67000);

        allEmployee(employee);
        System.out.println("==============================================================================");
        allSalary(employee);
        System.out.println("==============================================================================");
        allName(employee);
        System.out.println("==============================================================================");
        averageSalary(employee);
        System.out.println("==============================================================================");
        minSalary(employee);
        System.out.println("==============================================================================");
        maxSalary(employee);
    }
}