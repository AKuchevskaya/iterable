package comparable;

public class Employee implements Comparable<Employee>{ // Сотрудники
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Сортировка по зарплате
    @Override
    public int compareTo(Employee o){
        return (int) (this.salary - o.salary);
    }
    @Override
    public String toString(){
        return "Сотрудник { " + 
        " имя= " + name + 
        " возраст= " + age + 
        " зарплата= " + salary + " }";
    }
}
