package collections;

import pojo.Employee;
import pojo.Employee2;
import pojo.MyGenrics;

public class TestGenerics {
    public static void main(String args[]){

       // MyGenrics<Integer> genrics =new MyGenrics<Integer>();
       // System.out.println(genrics.getData());
        MyGenrics<Integer, Employee> genrics = new MyGenrics<Integer, Employee>(new Employee(1,"name",1234));
        System.out.println(genrics.getData1().getName());

        MyGenrics<Integer,Double> genrics1 = new MyGenrics<Integer,Double>();

    }



}
