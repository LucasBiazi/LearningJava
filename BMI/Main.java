
//Importing Scanner so we can read user input
import java.util.Scanner;

public class Main {
    // Comparison method
    static void Comparison(float result) {
        if (result < 18.5) {
            System.out.println("BMI: " + result + ".You are underweight!");
        } else if (result > 18.5 && result < 24.9) {
            System.out.println("BMI: " + result + ".You are normal!");
        } else if (result > 25 && result < 29.9) {
            System.out.println("BMI: " + result + ".You are overweight!");
        } else if (result > 30) {
            System.out.println("BMI: " + result + ".You are obese!");
        }
    }

    // Main method
    public static void main(String[] args) {
        int choice;
        choice = 0;
        float height, weight, result;
        Scanner scanner = new Scanner(System.in);
        // Main loop
        while (choice != 2) {
            System.out.println("\nWelcome to the BMI calculator:\n(1)Calculate BMI\n(2)Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: // Calculate the BMI
                    System.out.println("Type in your weight (kg):");
                    weight = scanner.nextFloat();
                    System.out.println("Type in your height (m):");
                    height = scanner.nextFloat();
                    result = (weight / (height * height));
                    // Comparisons' method
                    Comparison(result);
                    break;
                case 2: // Exit program
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid value!");
                    break;
            }
        }
    }
}