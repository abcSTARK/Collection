package collections;

import java.util.*;

public class DemoHashSet {

    public static void main (String args[]){

        Set<Integer> l =new TreeSet<>();
        l.add(10);//autoboxing
        l.add(20);
        l.add(6);
        l.add(700);
        l.add(78);

        System.out.println("Original Set : " + l);

        l.add(10);
        System.out.println("After adding 10 , Set : " + l);
        System.out.println("After adding 10 , Set Size : " + l.size());
        /*
        l.add("hello");
        System.out.println("After adding hello , List : " + l);
        System.out.println("After adding hello , List Size : " + l.size());
        */
        //Integer value =l.get(5);
        //System.out.println("value at 5th pos : " + value);

        l.remove(new Integer(10));
        System.out.println("After removing 10 , Set : " + l);
        System.out.println("After removing 10 , Set Size : " + l.size());

        /*l.removeIf((v)->v>10);
        System.out.println("After removing 10 predicative, List : " + l);
        System.out.println("After removing 10 predicative, List Size : " + l.size());*/

        int add=0;
        Iterator<Integer> iterator=l.iterator();
        while(iterator.hasNext()){
            int i= iterator.next();
            System.out.println(i);
            add+=i;
        }
        System.out.println("Total = "+add);

        System.out.println("******** Using For Each ********");
        for(int i:l)
            System.out.println(i);

        System.out.println("******** Using Consumer ********");
        l.forEach((d)->{
            System.out.println(d);
        });

        //More easy way
        l.forEach(System.out::println);




    }
}
