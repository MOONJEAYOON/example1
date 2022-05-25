import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name,department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override //오버라이딩을 강제하기 위한 애너테이션입니다.
    public int compareTo(Employee employee) {
        if(id > employee.id) {
            return 1;
        } else if(id < employee.id){
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        Set<Employee> workers = new TreeSet<>();

        Employee employee1 = new Employee(11,"Kim Coding","Software Engineering");
        Employee employee2 = new Employee(5,"Lee Java","Growth Marketing");
        Employee employee3 = new Employee(7,"Park Hacker","Software Engineering");

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for(Employee employee:workers){
            System.out.println(employee.id+" "+employee.name+" "+employee.department+" ");
        }
    }
}