
public class Animal {

    private String name;
    private int age;
    private float weight;

    //Constructor method
    public void createAnimal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    ;

    //Getters
    public String getName() {
        return name;
    }

    ;
    
    public int getAge() {
        return age;
    }

    ;

    public float getWeight() {
        return weight;
    }

    ;

    
    //Setters
    public void setName(String newName) {
        this.name = newName;
    }

    ;
    public void setAge(int newAge) {
        this.age = newAge;
    }

    ;
    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }
;

}
