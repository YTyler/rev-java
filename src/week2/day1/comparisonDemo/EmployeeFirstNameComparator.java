package week2.day1.comparisonDemo;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.firstName.compareTo(emp2.firstName);
    }
}