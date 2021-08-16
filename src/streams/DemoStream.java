package streams;

import pojo.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

    public static void main (String args[]){

        Stream<Integer> stream = Stream.of(1,2,4,66,77,21);
        stream.forEach(System.out::println);
        //stream.forEach(System.out::println); //never reuse stream

        String [] fruits= new String[] {"mango","papaya","guava"};
        Stream<String> stream1= Arrays.stream(fruits);
        stream1.forEach(System.out::println);

        Stream<String> stream2= Stream.empty();
        stream2.forEach(System.out::println);

        List<Employee> employees= new ArrayList<Employee>();

        employees.add(new Employee());
        employees.add(new Employee(1,"ABC",12000));
        employees.add(new Employee(33,"XYZ",22000));
        employees.add(new Employee(5,"ABC",12500));
        employees.add(new Employee(89,"ABC",25000));
        employees.add(new Employee(33,"XYZ",22000));

        Stream<Employee> stream3= employees.stream();
        //stream3.forEach(System.out::println);

        stream3.filter((e)->{
            System.out.println("filter invoked !");
            return e.getSalary()>1000;
        }).count(); //also try .findFirst()
    }
}
