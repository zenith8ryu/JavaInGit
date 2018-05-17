package javaStudy.selfTraining.basic.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpr {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("pineapple");

        lambdaMtd(fruits);
//        anonyClsMtd(fruits);
        List<String> fruits_upper = streamMtd(fruits);

        for (String fruit : fruits_upper) {
            System.out.println(fruit);
        }

    }

    public static void lambdaMtd(List<String> fruits) {
        Collections.sort(fruits, (o1, o2) -> o1.compareTo(o2));
    }

    public static void anonyClsMtd(List<String> fruits) {
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public static List<String> streamMtd(List<String> fruits) {
        return fruits.stream().map( (String elem) -> { return elem.toUpperCase();} ).collect(Collectors.toList());
    }
}
