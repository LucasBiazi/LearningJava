public class Person {

    int age;
    String name;

    public Person(int person_age, String person_name) {
        age = person_age;
        name = person_name;
    }

    public void Greet(String name) {
        System.out.println("My name is " + name + ".");
    }

}
