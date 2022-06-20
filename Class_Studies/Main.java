public class Main {
    public static void main(String[] args) {
        // Normal Class
        Person person = new Person(63, "Joe");
        person.Greet(person.name);

        // Encapsulation
        City city = new City();
        city.setCode(1);
        city.setName("Las Vegas");
        System.out.println(city.get_name() + " has the following code: " + city.get_code());

        // The class Cruze extends the class Car
        Cruze model_ltz = new Cruze();
        model_ltz.TurnOn();

        // The class Dog implements the interface Animals
        Dog spot = new Dog();
        spot.Sound();
    }
}
