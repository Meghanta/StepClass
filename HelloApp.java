public class HelloApp {
    public static void main(String[] args) {

        // Default message
        String names = "World";

        // If arguments are given, join them
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print output
        System.out.println("Hello, " + names + "!");
    }
}