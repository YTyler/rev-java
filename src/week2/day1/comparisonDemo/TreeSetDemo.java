package week2.day1.comparisonDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        EmployeeFirstNameComparator employeeFirstNameComparator = new EmployeeFirstNameComparator();
        TreeSet<Employee> employees = new TreeSet<>(employeeFirstNameComparator);
        employees.add(new Employee(101, "Jacob", "Kula", "j19kula@gmail.com"));
        employees.add(new Employee(102, "Meredith", "Kula", "m4jkula@gmail.com"));
        employees.add(new Employee(103, "Joshua", "Kula", "jkula@gmail.com"));
        employees.add(new Employee(104, "Jordan", "Kula", "Jordan@gmail.com"));
        employees.add(Employee.parseEmployee("105, Jeff, Kula, jkula@ryder.com"));

        Employee emp102 = new Employee(102, "Jacob", "K", "L");
        employees.add(emp102);

        for (Employee employee : employees) {
            System.out.println(employee.toCSV());
        }
    }
}
