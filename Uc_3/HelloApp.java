public class HelloApp {
    public static void main(String[] args) {

        // Check if argument is given, else use default "World"
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}