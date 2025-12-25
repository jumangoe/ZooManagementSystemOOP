public class Zookeeper {
    private String name;
    private int experienceYears;

    public Zookeeper(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public void displayInfo() {
        System.out.println("Zookeeper: " + name + ", Experience: " + experienceYears + " years");
    }
}