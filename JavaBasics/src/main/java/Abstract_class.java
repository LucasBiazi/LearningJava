abstract class Abstract_class {

    String name;
    int age;
    float weight;

    public abstract void create_person(String name, int age, float weight);

}

class Person extends Abstract_class {

    public void create_person(String Name, int Age, float Weight) {
        name = Name;
        age = Age;
        weight = Weight;
        System.out.print("Human name: " + name + "\n"
                + "Human age: " + age + "\n"
                + "Human weight: " + weight+"\n\n");
    }

}
