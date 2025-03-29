import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Vignesh", 45000),
            new Employee("Tamil", 55000),
            new Employee("karthick", 60000),
            new Employee("Sreedharan", 30000),
            new Employee("Adhi", 70000)
        );
        System.out.println("Original List:");
        employees.forEach(System.out::println);

        double salaryThreshold = 50000; 
        List<Employee> filteredAndTransformed = employees.stream()
            .filter(emp -> emp.getSalary() >= salaryThreshold)  
            .map(emp -> new Employee(emp.getName().toUpperCase(), emp.getSalary()))  
            .collect(Collectors.toList());  
            
        System.out.println("\nFiltered and Transformed List:");
        filteredAndTransformed.forEach(System.out::println);
    }
}

