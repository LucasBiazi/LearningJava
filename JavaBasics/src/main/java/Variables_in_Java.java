
public class Variables_in_Java {

    //The following Method is the main Java method!
    public static void main(String[] args) {
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
    }

}
