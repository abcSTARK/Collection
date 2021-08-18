package collections;

import pojo.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()- o2.getSalary();

    }
}
