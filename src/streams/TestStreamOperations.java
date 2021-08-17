package streams;

import pojo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamOperations {

    public static void main(String args[]){

        List<Student> students = Arrays.asList(
                new Student(12,"abc",98.78d),
                new Student(17,"abc",50.70d),
                new Student(12,"XYZ",78.75d),
                new Student(27,"a",70.70d),
                new Student(33,"XYZ",87.80d),
                new Student(34,"abc",45.70d));

        List<Student> students1 = Arrays.asList(
                new Student(12, "aBC", new int[] { 3, 1, 2 }),
                new Student(17, "CBC", new int[] { 30, 45,10  }),
                new Student(1, "XYZ", new int[] { 5, 12, 77 }),
                new Student(16, "a", new int[] { 6, 5, 6 }),
                new Student(2, "a", new int[] { 7, 9, 60 }),
                new Student(55, "a", new int[] { 30, 50, 5 }));

        //displayForEach(students);
        //displayStream(students);
        //filter(students,50).forEach(System.out::println);
        //filterAllStudentsByPer(students,50).forEach(System.out::println);
        //filterAllStudentsByPer_limit(students,50).forEach(System.out::println);
        //findNumberOfStudentsByPer(students,50);
        /*Optional<Student> optional = findOneStudentByName(students,"XYZ");
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        else{
            System.out.println("No matching Student");
        }*/
        //List<Integer> total = calculateTotalMarks(students1);
        List<Student> total = calculateTotalMarks1(students1);
        total.forEach(System.out::println);



    }

    static void displayForEach(List <Student> students){
        students.forEach(System.out::println);
    }

    static void displayStream(List <Student> students){
        students.stream().forEach(System.out::println);
    }

    static List<Student> filter(List <Student> students,long per){
        List<Student> stu_per=new ArrayList<Student>();
        for(Student s:students){
            if(s.getPercentage()>=per){
                stu_per.add(s);
            }
        }
        return stu_per;
    }

    static List<Student> filterAllStudentsByPer(List <Student> students,long per){
        return students.stream().filter((s)->{
            return(s.getPercentage()>=per) ;
        }).collect(Collectors.toList());
    }

    static List<Student> filterAllStudentsByPer_limit(List <Student> students,long per){
        return students.stream().filter((s)->{
            //System.out.println("called");
            return(s.getPercentage()>=per) ;
        }).limit(2).collect(Collectors.toList());
    }

    static void findNumberOfStudentsByPer(List <Student> students,long per){
        long count = students.stream().filter((s)->{
            return(s.getPercentage()>=per) ;
        }).count();
        System.out.println("Count of students who obtained more than "+per+" % is : "+count);
    }

    static Optional<Student> findOneStudentByName(List<Student> students , String name){
        return students.stream().filter((s)->{
            return s.getName().equals(name);
        }).findFirst();
    }

    public static List<Integer> calculateTotalMarks(List<Student> students){

        return students.stream().map((stu)->{
            int total = 0;
            for(int mark:stu.getMarks()){
                total+=mark;
            }
            return total;
        }).collect(Collectors.toList());
    }

    public static List<Student> calculateTotalMarks1(List<Student> students){

        return students.stream().map((stu)->{
            int total = 0;
            for(int mark:stu.getMarks()){
                total+=mark;
            }
            stu.setPercentage(total);
            return stu;
        }).collect(Collectors.toList());
    }

}
