package collections;

import pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class DemoEmployeeList {

    public static void main(String[] args){

        List<Employee> employees= new ArrayList<Employee>();

        employees.add(new Employee());
        employees.add(new Employee(1,"ABC",12000));
        employees.add(new Employee(33,"XYZ",22000));
        employees.add(new Employee(5,"ABC",12500));
        employees.add(new Employee(89,"ABC",25000));
        employees.add(new Employee(33,"XYZ",22000));

        System.out.println("Original List : " + employees);
        System.out.println("Original List Size : " + employees.size());

        employees.remove(0);
        System.out.println("Removing 1st pos List : " + employees);
        System.out.println("After removing  Size : " + employees.size());

        employees.remove(new Employee(33,"XYZ",22000));
        System.out.println("Removing 33 List : " + employees);
        System.out.println("After removing  Size : " + employees.size());

        boolean contains = employees.contains(new Employee(5,"ABC",12500));
        System.out.println("Contains in List : " + contains);

        for(Employee e :employees)
            System.out.println(e.getEmpId()+":"+e.getName());

        System.out.println("********** Using FOR EACH ************");
        employees.forEach((e)->{
            System.out.println(e.getEmpId()+":"+e.getName());
        });

        System.out.println("********** Using METHOD REF ************");
        employees.forEach(System.out::println);



    }
}
