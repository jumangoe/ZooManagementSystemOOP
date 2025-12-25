public abstract class Animal {
    protected String name;
    protected String species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String getType();

    public String toString() {
        return name + " (" + species + "), age " + age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}