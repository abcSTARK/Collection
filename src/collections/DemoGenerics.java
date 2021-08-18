package collections;

import pojo.Employee;
import pojo.WageEmployee;

import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {
    public static void main(String args[]){
        List<Employee> list =new ArrayList<Employee>();
        list.add(new Employee());
        list.add(new WageEmployee());

      //List<Employee> list2 =new ArrayList<WageEmployeeEmployee>(); // not allowed since its erased at compilation time/
      //List<?> list3 =new ArrayList<Employee>();
        List<? extends Employee> list4=new ArrayList<WageEmployee>();
      //list4.add(new WageEmployee()); //can't perform add

        List<? super WageEmployee> list5=new ArrayList<Employee>();

        List<Employee> list6 =new ArrayList<Employee>();
        list6.add(new Employee());
        list6.add(new WageEmployee());

        //data.(list5);//not possible


    }
    static void data(List<? extends Employee> list2){

    }

}
