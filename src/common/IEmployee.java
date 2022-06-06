package common;

public interface IEmployee {

    String getName();
    double getSalary();

    default void print(String str){
        System.out.print(str);
    }

    static void println(String str){
        System.out.println(str);
    }
}
