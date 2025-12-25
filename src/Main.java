public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Almaty Zoo", "Almaty");
        Zookeeper zookeeper = new Zookeeper("Alex", 10);

        Animal a1 = new Lion("Leo", 5);
        Animal a2 = new Lion("Simba", 3);

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);

        zoo.displayInfo();
        zookeeper.displayInfo();

        zoo.displayAnimals();
    }
}