package streams;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import pojo.Product;

import java.util.*;
import java.util.stream.Collectors;

public class TestGroupBy_Partition {

    public static void main(String args[]){
        List<Product> products = Arrays.asList(
                new Product("apple", 10, 9.99),
                new Product("banana", 20, 19.99),
                new Product("orange", 10, 29.99),
                new Product("watermelon", 10, 29.99),
                new Product("papaya", 20, 9.99),
                new Product("apple", 10, 9.99),
                new Product("banana", 11, 19.99),
                new Product("apple", 10, 9.99));

        //products.forEach(System.out::println);
        //group by name
        products.stream().collect(Collectors.groupingBy(Product::getName)).forEach((key,list)->{
            System.out.println(key +" : ");
            list.forEach(System.out::println);
            System.out.println("***********");
        });

        //group by name and count
        products.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting())).forEach((key,num)->{
            System.out.println(key +" : "+num);
            System.out.println("***********");
        });

        //partitioning by quantity
        System.out.println("********** Partition by quantity ***********");
        Map<Boolean,List<Product>> map =products.stream().collect(Collectors.partitioningBy(p -> p.getQty()==10));
        map.forEach((key,list)->{
            System.out.println(key + " : "+ list);
        });

        System.out.println("********** Collection Status ***********");
        Map<String, Integer> map2= products.stream().collect(Collectors.groupingBy(Product::getName,Collectors.summingInt(Product::getQty)));
        System.out.println(map2);

        System.out.println("********** Double Summary on whole dataset ***********");
        DoubleSummaryStatistics stats =products.stream().mapToDouble(Product::getPrice).summaryStatistics();
        System.out.println(stats);

        System.out.println("********** Int Summary on Keys and summary by qty ***********");
        Map<String,IntSummaryStatistics> summarizingInt = products.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.summarizingInt(Product::getQty)));
        System.out.println(summarizingInt);

    }
}
