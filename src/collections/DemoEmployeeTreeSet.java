package collections;

import pojo.Employee;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoEmployeeTreeSet {
    public static void main(String[] args){

        Set<Employee> employees= new TreeSet<Employee>(new EmployeeComparator());
        //Set<Employee> employees= new TreeSet<Employee>((o1,o2)->o1.getEmpId()- o2.getEmpId());


        employees.add(new Employee(1,"ABC",12000));
        employees.add(new Employee(33,"XYZ",22000));
        employees.add(new Employee(5,"ABC",12500));
        employees.add(new Employee(89,"ABC",25000));
        employees.add(new Employee(33,"XYZ",22000));

        System.out.println("Original Set : " + employees);
        System.out.println("Original Set Size : " + employees.size());

        //employees.remove(0);
        //System.out.println("Removing 1st pos Set : " + employees);
        //System.out.println("After removing  Size : " + employees.size());

        employees.remove(new Employee(33,"XYZ",22000));
        System.out.println("Removing 33 Set : " + employees);
        System.out.println("After removing  Size : " + employees.size());

        boolean contains = employees.contains(new Employee(5,"ABC",12500));
        System.out.println("Contains in Set : " + contains);

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
