import java.util.*;

public class Zoo {
    private String zooName;
    private String city;
    private List<Animal> animals = new ArrayList<>();

    public Zoo(String zooName, String city) {
        this.zooName = zooName;
        this.city = city;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayInfo() {
        System.out.println("Zoo: " + zooName + ", City: " + city);
    }

    public void displayAnimals() {
        animals.forEach(System.out::println);
    }
}