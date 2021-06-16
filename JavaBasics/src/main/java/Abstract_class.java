
abstract class Abstract_class {

    public String name;
    public int age;
    public float weight;

    public abstract void create_person(String name, int age, float weight);

}

class Person extends Abstract_class {

    public void create_person(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.print("Human name: " + name + "\n"
                + "Human age: " + age + "\n"
                + "Human weight: " + weight + "\n\n");
    }

}
