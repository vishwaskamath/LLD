package javalearning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaLearn {

    public static void main(String[] args) {

        //takes any input and return boolean
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Hello World"));

        //takes any input and will return any output
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello"));
        System.out.println(function.apply("Hello World"));

        //takes input and returns void
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Hello");

        //takes no input and return any output
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        System.out.println(supplier.get());

        //custom functional interface internally its just anonymous class
        Addition addition = (a, b) -> a + b;
        System.out.println(addition.add(5, 10));
    }
}
