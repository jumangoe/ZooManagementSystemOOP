public class Main {
    public static void main(String[] args) {

        Animal a1=new Animal("Leo", "Lion", 5);
        Animal a2=new Animal("Max", "Tiger", 5);

        Zookeeper zookeeper=new Zookeeper("Alex", 10);
        Zoo zoo=new Zoo("Almaty Zoo", "Almaty");

        zoo.displayInfo();
        zookeeper.displayInfo();

        a1.displayInfo();
        a2.displayInfo();

        // Comparison
        if (a1.getAge()==a2.getAge()) {
            System.out.println("Animals are the same age.");
        } else {
            System.out.println("Animals are of different ages.");
        }
    }
}