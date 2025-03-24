import java.util.function.*;

public class FunctionDemo {
    public static void main(String[] args) {
        // Consumer: Takes an input and performs an action without returning a result
        Consumer<String> consumer = message -> System.out.println("Consumed: " + message);
        consumer.accept("Hello, Java!");

        // Function: Takes an input and returns a transformed result
        Function<Integer, String> function = num -> "Converted: " + (num * 2);
        System.out.println(function.apply(10));

        // Predicate: Evaluates a condition and returns a boolean result
        Predicate<Integer> predicate = num -> num > 0;
        System.out.println("Is positive? " + predicate.test(5));

        // Supplier: Provides a result without requiring input
        Supplier<String> supplier = () -> "Generated String";
        System.out.println(supplier.get());
    }
}
