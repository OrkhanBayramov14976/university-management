
@FunctionalInterface
interface AFuncInt {
    void apply(String input);

    static void print(String input) {
        System.out.println("Static method: " + input);
    }

    default void print(String input1, String input2) {
        System.out.println("Default method: " + input1 + ", " + input2);
    }
}

// Main class
public class interfacesTask {
    public static void main(String[] args) {
        // Anonymous class implementation
        AFuncInt anonymousInstance = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous class apply: " + input);
            }
        };
            anonymousInstance.apply("Hello from Orkhan Bayramov! I wrote this code myself so please dont fail me.");
            AFuncInt.print("This is me again. I got sudden motivation at 11:22 PM 23.03.2025. Now i am sitting here learning basic intirfaces.");
            
            // As i did in line 14  we will have 2 inputs
            
            anonymousInstance.print("I am not sure weather you will read this but i am still writing because writing this entartains me :-) ", "I love oranges");

            // Here i Implement Lambda I didnt figure out yet why but i still did
            AFuncInt lambadaInstance = input -> System.out.println("Lambda apply: " + input);
            //As i understood after 12 minutes that lambda is short "creation" of interface. Fast,clear and short.
            lambadaInstance.apply("As you can see i applied lambda here. Thank you for your time!");

    }
}
