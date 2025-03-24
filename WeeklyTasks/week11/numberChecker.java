import java.awt.Point;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

interface SpecificProperty<T> {
    boolean test(T t);
}

class Person {
    String firstname;
    String secondname;
    int age;

    public Person(String firstname, String secondname, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstname + " " + secondname + " (" + age + ")";
    }
}

public class numberChecker {
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = num -> num % 2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = p -> p.x > 0 && p.y > 0;
        SpecificProperty<String> isPangram = str -> str.toLowerCase()
                .chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
        SpecificProperty<Person> isOlderThan20 = person -> person.age > 20;

        System.out.println("Is 5 odd? " + isOdd.test(5));
        System.out.println("Is (3,4) in the first quadrant? " + isInFirstQuadrant.test(new Point(3, 4)));
        System.out.println("Is 'The quick brown fox jumps over the lazy dog' a pangram? " +
                isPangram.test("The quick brown fox jumps over the lazy dog"));
        System.out.println("Is John Doe (25) older than 20? " + isOlderThan20.test(new Person("John", "Doe", 25)));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Odd numbers: " + filter(numbers, isOdd));

        List<Person> people = Arrays.asList(
                new Person("Alice", "Smith", 18),
                new Person("Bob", "Brown", 21),
                new Person("Charlie", "Davis", 30)
        );

        System.out.println("People older than 20: " + filter(people, isOlderThan20));
    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        return c.stream().filter(p::test).collect(Collectors.toList());
    }
}
