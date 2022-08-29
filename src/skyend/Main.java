package skyend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void allEmployee(Map<String,Employee> employeeBook) {
        for (Employee employee:employeeBook.values()) {
            System.out.println(employee);
        }
    }

    public static int allSalary(Map<String,Employee> employeeBook) {
        int sum = 0;
        for (Employee employee:employeeBook.values()) {
            sum += employee.getSalary();
        }
        System.out.println("Общая сумма зарплат составляет:" + sum);

        return sum;
    }


    public static void averageSalary(Map<String,Employee> employeeBook) {
        float averageSalary = 0;
        for (Employee employee:employeeBook.values()) {
            averageSalary += employee.getSalary();
        }
        averageSalary = averageSalary / employeeBook.size();
        System.out.println("Средняя зарплата составляет:" + averageSalary);

    }

    public static void minSalary(Map<String,Employee> employeeBook) {
        String minSalaryEmployee = "";
        int minSalary =10000000;
        for (Employee employee:employeeBook.values()) {
            if (minSalary > employee.getSalary()) {
                minSalaryEmployee=employee.getName();
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная затрата сотрудника:" + " " + minSalary + "у" + " " + minSalaryEmployee);
    }
public static void maxSalary(Map<String,Employee> employeeBook) {
        String maxSalaryEmployee = "";
        int maxSalary =0;
        for (Employee employee:employeeBook.values()) {
            if (maxSalary < employee.getSalary()) {
                maxSalaryEmployee=employee.getName();
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника:" + " " + maxSalary + "у" + " " + maxSalaryEmployee);
    }



    public static void allName(Map<String,Employee> employeeBook) {
        for (Employee employee:employeeBook.values()) {
            System.out.println("И.Ф.О. сотрудника:" + employee.getName());
        }
    }

    public static void main(String[] args) {

        Map<String, Employee> employeeBook = new HashMap<>();
        employeeBook.put("Прокопенко Роман Сергеевич", new Employee("Прокопенко Роман Сергеевич", 2, 65000));
        employeeBook.put("Иванов Андрей Викторович",new Employee("Иванов Андрей Викторович",3, 55000));
        employeeBook.put("Изотов роман Сергеевич", new Employee("Изотов роман Сергеевич", 1, 89000));
        employeeBook.put("Коротких Семен Андреич ", new Employee("Коротких Семен Андреич ", 1, 93000));
        employeeBook.put("Смирнов Артур Михайлович",  new Employee("Смирнов Артур Михайлович", 2, 86000));
        employeeBook.put("Новиков Константин Иванович", new Employee("Новиков Константин Иванович", 4, 73000));
        employeeBook.put("Кроткин Александр Эдуардович", new Employee("Кроткин Александр Эдуардович", 2, 65000));
        employeeBook.put("Шкрильняк Андрей Петрович", new Employee("Шкрильняк Андрей Петрович", 3, 68000));
        employeeBook.put( "Сибогатов Игорь Романович",new Employee("Сибогатов Игорь Романович", 4, 49000));
        employeeBook.put( "Капроизов Артём Александрович",new Employee("Капроизов Артём Александрович", 5, 67000));

       allEmployee(employeeBook);
       System.out.println("==============================================================================");
        allSalary(employeeBook);
       System.out.println("==============================================================================");
       allName(employeeBook);
       System.out.println("==============================================================================");
        averageSalary(employeeBook);
        System.out.println("==============================================================================");
        minSalary(employeeBook);
        System.out.println("==============================================================================");
       maxSalary(employeeBook);
    }
}