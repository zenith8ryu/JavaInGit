package javaStudy.selfTraining.practice;

public class generics_04 {
    public static void main(String[] args) {
        printMsg("111",222,"aaaa");
    }

    public static <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试, t is " + t);
        }
    }
}
