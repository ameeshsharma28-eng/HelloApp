public class HelloApp {

    public static void main(String[] args) {

        String greeting;

        // Step 1: Check if no arguments
        if (args.length == 0) {

            greeting = "Hello, World!";

        } else {

            // Step 2: Create StringBuilder
            StringBuilder nameBuilder = new StringBuilder();

            // Step 3: Add names with comma
            for (String name : args) {

                nameBuilder.append(name);
                nameBuilder.append(", ");

            }

            // Step 4: Remove last comma and space
            if (nameBuilder.length() > 0) {

                greeting =
                        "Hello, "
                        + nameBuilder.substring(
                                0,
                                nameBuilder.length() - 2
                        )
                        + "!";

            } else {

                greeting = "Hello, World!";

            }
        }

        // Step 5: Print greeting
        System.out.println(greeting);

    }
}