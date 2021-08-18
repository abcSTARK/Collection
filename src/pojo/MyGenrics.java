package pojo;

import java.util.Objects;

public class MyGenrics<T,T1> {
    private String name;
    private T data;
    private T1 data1;


    public MyGenrics(T1 name) {

    }

    @Override
    public String toString() {
        return "MyGenrics{" +
                "name='" + name + '\'' +
                ", data=" + data +
                ", data1=" + data1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyGenrics<?, ?> myGenrics = (MyGenrics<?, ?>) o;
        return Objects.equals(name, myGenrics.name) && Objects.equals(data, myGenrics.data) && Objects.equals(data1, myGenrics.data1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data, data1);
    }

    public MyGenrics(String name, T data, T1 data1) {
        this.name = name;
        this.data = data;
        this.data1 = data1;
    }

    public T1 getData1() {
        return data1;
    }

    public void setData1(T1 data1) {
        this.data1 = data1;
    }

    public MyGenrics(String name, T data) {
        this.name = name;
        this.data = data;
    }

    public MyGenrics(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
