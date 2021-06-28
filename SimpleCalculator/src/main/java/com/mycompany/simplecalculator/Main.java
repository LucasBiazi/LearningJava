package com.mycompany.simplecalculator;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public void Calculation(int choice) {
        int v1;
        int v2;
        System.out.println("Enter the first value:");
        v1 = sc.nextInt();
        System.out.println("Enter the second value:");
        v2 = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nResult:" + (v1 + v2) + "\n");
                break;
            case 2:
                System.out.println("\nResult:" + (v1 - v2) + "\n");
                break;
            case 3:
                System.out.println("\nResult:" + (v1 * v2) + "\n");
                break;
            default:
                if (v2 == 0) {
                    System.out.println("Cannot divide by 0!" + "\n");
                    break;
                }
                System.out.println("\nResult:" + (v1 / v2) + "\n");
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Main main = new Main();
        System.out.println("This is a simple 4 operations calculator, it only accepts 2 values as input.");
        while (choice != 5) {
            System.out.println("\nChoose an operation: \n(1) Addition  \n(2) Subtraction \n(3) Multiplication \n(4) Division \n(5) Exit");
            choice = main.sc.nextInt();
            switch (choice) {
                case 1: // Addition
                    main.Calculation(choice);
                    break;
                case 2: // Subtraction
                    main.Calculation(choice);
                    break;
                case 3: // Multiplication
                    main.Calculation(choice);
                    break;
                case 4: // Division
                    main.Calculation(choice);
                    break;
                case 5: // Exit
                    System.out.print("Good bye!");
                    choice = 5;
                    break;
                default:
                    System.out.print(choice + "is not a valid option. \n");
            }
        }
    }

}
