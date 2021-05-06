package mathpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumVariousTypes<T> {

    private T arg1;
    private T arg2;
    private T sum;

    public T getArg1() {
        return arg1;
    }

    public T getArg2() {
        return arg2;
    }

    SumVariousTypes(T arg1, T arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public T getSum() {
        return sum;
    }

    public void setArg1(T arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(T arg2) {
        this.arg2 = arg2;
    }

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//        List<T>  list = ArrayList<T>();
        System.out.println("Enter ints - 2 nums");
        SumVariousTypes<Integer> intX = new SumVariousTypes<>(3,4);
        SumVariousTypes<Double> doubleX = new SumVariousTypes<>(3.1,4.1);
        System.out.println(intX.getArg1() + " " + intX.getArg2());
        System.out.println(doubleX.getArg1() + " " + doubleX.getArg2());
//        System.out.println(new SumVariousTypes(3.1,4.2).getSum());
    }
}
