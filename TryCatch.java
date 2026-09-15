/**
 * @author Abdul
 * @version 1.0.0
 * @since 2026-09-15
 */

import java.util.Scanner;

/**
 * Calculates the volume of a sphere based on user input.
 */
public final class TryCatch {

    /**
     * For utility class.
     */
    private TryCatch() {
    }

    /**
     * To run program.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gets radius from user input.
        System.out.print("Enter radius of sphere (cm): ");
        // Casts radius into a double.
        double radius = scanner.nextDouble();

        // Check to ensure radius is posti
        if (radius <= 0) {
            System.out.println("Error: Radius must be positive.");
        } else {
                // Formula to calculate volume of a sphere.
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                // Rounds volume to three decimal places.
                String formatted = String.format("%.3f", volume);
            // Displays results.
            System.out.println("Volume of sphere: " + formatted + " cm^3");
        }

        scanner.close();
    }
}
