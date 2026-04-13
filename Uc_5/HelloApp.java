public class HelloApp {

    public static void main(String[] args) {

        // Step 1: Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Step 2: Create StringBuilder
            StringBuilder names = new StringBuilder();

            // Step 3: Enhanced for loop
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Step 4: Remove last comma and space
            names.setLength(names.length() - 2);

            // Step 5: Print output
            System.out.println("Hello, " + names + "!");
        }
    }
}