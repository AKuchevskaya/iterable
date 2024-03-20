package comparable;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

    //Компаратор для сортировки пользователей по возрасту
    @Override
    public int compare(Employee o1, Employee o2){
        return Double.compare(o1.age, o2.age);
    }
}

