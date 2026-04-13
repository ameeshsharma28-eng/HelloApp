public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are passed
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with comma and space
            greeting = "Hello, " + String.join(", ", args) + "!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}