package collections;

import pojo.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoEmployeeHashMap {

    public static void main(String args[]){
        Map<String, Employee> map = new HashMap<>();

        map.put("a",new Employee(1,"name",12345));
        map.put("y",new Employee(34,"name123",12345));
        map.put("rt",new Employee(16,"abc",19000));

        System.out.println(map);
        System.out.println(map.size());

        map.put("XY",new Employee(1,"name",12345));
        System.out.println("**** Duplicate Value ****");
        System.out.println(map);
        System.out.println(map.size());

        map.put("XY",new Employee(12,"name new",777));
        System.out.println("**** Duplicate Key ****");
        System.out.println(map);
        System.out.println(map.size());

        System.out.println("**** Using For Each ****");
        map.forEach((Key,Value)->{ System.out.println(Key +" : "+Value); });

        Set<Map.Entry<String,Employee>> entries = map.entrySet();
        Iterator<Map.Entry<String,Employee>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Employee> entry = (Map.Entry<String,Employee>) iterator.next();
            map.put("abcd",new Employee(23,"name",23000));
            map.put("a",new Employee(1,"name iterator",23000));


        }

    }
}
