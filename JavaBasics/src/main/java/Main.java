// Importing a package

import java.util.Scanner;

public class Main {

    //Methods
    static void method(String beginning, String end, int one) {
        System.out.println(beginning + end + one + "!!!\n");
    }

    //Methods using return
    static int method2(int val1) {
        return val1;
    }

    private static void callSeparator() {
        System.out.println("\n\n##############################################################\n\n");
    }

    //The following Method is the main Java method!
    public static void main(String[] args) {

        //Method execution
        method("This is a simple ", "learning script!!!", method2(1));
        //Calling a static method by referencing its class name (since it is just a static method):
        Second.say_hello();
        //Instance (object) of the class Second (constructor method):
        Second car = new Second("Logan", 1978);
        car.load_car(car.car_name, car.year);

        // Some of the variables in Java    
        // Primitive types:
        int age = 35;
        boolean male = true;
        char sex = 'M';
        float weight = 170.65f;
        // Non primitive
        String name = "Gorilla Jhones";

        System.out.println(name + " is a " + age + " years old gorrila!");
        if (male == true) {
            System.out.print("He is a male! As a " + sex + " he weights " + weight + " Kg!");
        }

        //Separator
        callSeparator();

        // Type Casting: Transfering values through different types of variables
        int short_height = 1;
        float full_height = (float) (short_height + 0.576);
        System.out.println("Short height: " + short_height);
        System.out.print("Full height: " + full_height);

        //Separator
        callSeparator();

        //Basic math:
        //Addition/Sum
        int num1 = 10;
        int num2 = 90;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        //Subtraction
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        //Multiplication
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        //Division
        System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));

        //Separator
        callSeparator();

        //Random values
        // Random number between 0.0 and 0.9999...
        System.out.println(Math.random());
        // Random number between 0.0 and 10...
        System.out.println((int) (Math.random() * 11));

        //Separator
        callSeparator();

        //For each array
        //for(type variable: arrayname){}
        String[] names = {"Leo", "Mark", "Cloe", "Edna"};
        for (String i : names) {
            System.out.println("Good morning " + i + "!");
        }

        //Separator
        callSeparator();

        //Calling an implemented method from a abstract class:
        Person person = new Person();
        person.create_person("Jhonas", 34, 102.32f);
        person.create_person("Maryne", 18, 74.13f);
        person.create_person("Bob", 87, 94.71f);

        //Separator
        callSeparator();

        Animal animal_instance = new Animal();
        animal_instance.createAnimal("Tiger", 2, 160.456f);
        System.out.println("Non altered animal: \n" + "Name: "
                + animal_instance.getName() + "\nAge: "
                + animal_instance.getAge() + "\nWeight: "
                + animal_instance.getWeight());

        //Altering the animal by using the set's methods
        animal_instance.setName("White Tiger");
        animal_instance.setAge(4);
        animal_instance.setWeight(150.845f);

        System.out.println("\n\nAltered animal: \n" + "Name: "
                + animal_instance.getName() + "\nAge: "
                + animal_instance.getAge() + "\nWeight: "
                + animal_instance.getWeight());

        //Separator
        callSeparator();

        //Getting the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like p??zza?\nType your answer:\nyes        no");
        String answer = scanner.nextLine();

        if (answer.equals("yes")) {
            System.out.println("You do like pizza!");
        } else if (answer.equals("no")) {
            System.out.println("You do not like pizza!");
        } else {
            System.out.println("I didn't quite get it, sorry!");
        }

        //Separator
        callSeparator();
        // Working with nested classess:
        class InnerClass {

            class InnerIneerClass {

                final static int my_fake_age = 258;
            }

        }
        // Calling the static object from the nested class
        System.out.println("My fake age: " + InnerClass.InnerIneerClass.my_fake_age);

    }

}
