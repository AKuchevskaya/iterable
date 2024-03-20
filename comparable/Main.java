package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Федоров А.Н.", 30, 45000),
            new Employee("Иванов И.И.", 45, 30000),
            new Employee("Сидорова А.П.", 38, 55000)
        };

        // Сортировка по зарплате с использованием Comparable
        Arrays.sort(employees);
        System.out.println("Список отсортированный по зарплате");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //Сортировка по возрасту при помощи Comparator
        Arrays.sort(employees, new EmployeeSalaryComparator());
        System.out.println("Сортировка по возрасту");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
