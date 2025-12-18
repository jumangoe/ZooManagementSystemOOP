public class Zoo {
    private String zooName;
    private String city;

    public Zoo(String zooName, String city) {
        this.zooName=zooName;
        this.city=city;
    }

    public void displayInfo() {
        System.out.println("Zoo: " + zooName + ", City: " + city);
    }
}