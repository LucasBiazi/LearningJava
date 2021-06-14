
public class Main {

    //Methods
    static void method(String beginning, String end, int one) {
        System.out.println(beginning + end + one + "!!!\n");
    }

    //Methods using return
    static int method2(int val1) {
        return val1;
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
        System.out.print("\n\n############################################\n\n");

        // Type Casting: Transfering values through different types of variables
        int short_height = 1;
        float full_height = (float) (short_height + 0.576);
        System.out.println("Short height: " + short_height);
        System.out.print("Full height: " + full_height);

        //Separator
        System.out.print("\n\n############################################\n\n");

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
        System.out.print("\n\n############################################\n\n");

        //Random values
        // Random number between 0.0 and 0.9999...
        System.out.println(Math.random());
        // Random number between 0.0 and 10...
        System.out.println((int) (Math.random() * 11));

        //Separator
        System.out.print("\n\n############################################\n\n");

        //For each array
        //for(type variable: arrayname){}
        String[] names = {"Leo", "Mark", "Cloe", "Edna"};
        for (String i : names) {
            System.out.println("Good morning " + i + "!");
        }
    }

}
