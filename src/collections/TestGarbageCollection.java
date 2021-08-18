package collections;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class TestGarbageCollection {
    public static void main(String args[]){
        TestGarbageCollection t =new TestGarbageCollection();
        TestGarbageCollection t1 =new TestGarbageCollection();

        System.gc();
        t1=null;
        Runtime.getRuntime().gc();
    }
    @Override
    protected void finalize()throws Throwable{
        System.out.println("Garbage collector called");
        System.out.println("Object Garbage collected"+this);


    }
}
