package pojo;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private double percentage;
    private int [] marks;
    private int age;
    private int std;

    public Student(){

    }

    public Student(int rollNo, String name, double percentage, int[] marks, int age, int std) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        this.marks = marks;
        this.age = age;
        this.std = std;
    }

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", marks=" + Arrays.toString(marks) +
                ", age=" + age +
                ", std=" + std +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Double.compare(student.percentage, percentage) == 0 && age == student.age && std == student.std && Objects.equals(name, student.name) && Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rollNo, name, percentage, age, std);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
