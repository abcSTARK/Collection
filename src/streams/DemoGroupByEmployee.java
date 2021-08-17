package streams;

import pojo.Department;
import pojo.Employee2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DemoGroupByEmployee {
    public static void main(String[] args){

        List<Employee2> employees = Arrays.asList(
                new Employee2(1, "ABC", "Mumbai", Department.Development),
                new Employee2(101, "ABCD", "Mumbai", Department.DevOPS),
                new Employee2(6, "XYZ", "Banglore", Department.Development),
                new Employee2(78, "LMN", "Chennai", Department.Development),
                new Employee2(1, "ABC", "Chennai", Department.Testing),
                new Employee2(10, "ABC", "Banglore", Department.Development),
                new Employee2(1, "ABC", "Banglore", Department.Development),
                new Employee2(1, "ABC", "Banglore", Department.Testing));

        System.out.println("*********** By Department type ***********");
        Map<Department,List<Employee2>> departmentType = employees.stream()
                .collect(Collectors.groupingBy(Employee2::getDepartment));
        departmentType.forEach((dept_name, list)->{
            System.out.println("dept name:-"+dept_name);
            list.forEach(System.out::println);
        });

        System.out.println("*********** By Department type and Location ***********");
        Map<MyTuple,List<Employee2>> departmentTypeAndLocation = employees.stream().collect(
                Collectors.groupingBy(employee -> new MyTuple(employee.getDepartment(), employee.getLocation())));
        System.out.println(departmentTypeAndLocation);

        System.out.println("*********** By Department type and Location Formatted by forEach***********");
        departmentTypeAndLocation.forEach((tuple,list)->{
            System.out.println(tuple.getLocation() +" : "+ tuple.getDepartment());
            System.out.println("-----------------------");
            list.forEach(System.out::println);
            System.out.println("-----------------------");

        });

    }
}

class MyTuple{
    private Department department;
    String location;

    public MyTuple(){
    }

    public MyTuple(Department department, String location) {
        this.department = department;
        this.location = location;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTuple myTuple = (MyTuple) o;
        return department == myTuple.department && Objects.equals(location, myTuple.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, location);
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "department=" + department +
                ", location='" + location + '\'' +
                '}';
    }
}
