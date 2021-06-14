
public class Second {

    //Variables
    //Final variables cannot have their values changed
    final String car_name;
    final int year;

    //Constructor    
    public Second(String Name, int Year) {
        car_name = Name;
        year = Year;
    }

    static void load_car(String name, int year) {
        System.out.println(name + " was produced in " + year + "!");
    }

    static void say_hello() {
        System.out.println("I'm a static method! I can be summoned without the instance of an object!");
    }
;
}
