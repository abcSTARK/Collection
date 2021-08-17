package pojo;

import java.util.Objects;

public class Employee2 {
    private int empId;
    private String name;
    private String location;
    Department department;

    public Employee2(int empId, String name, String location, Department department) {
        this.empId = empId;
        this.name = name;
        this.location = location;
        this.department = department;
    }
    public Employee2(){
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return empId == employee2.empId && Objects.equals(name, employee2.name) && Objects.equals(location, employee2.location) && department == employee2.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, location, department);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", department=" + department +
                '}';
    }
}

