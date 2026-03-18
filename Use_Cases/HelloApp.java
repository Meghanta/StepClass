public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficiency
            StringBuilder names = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}