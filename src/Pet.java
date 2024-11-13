abstract class Pet {

    private String name;
    private int age;
    protected String species;

    // constructor
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // returns the name of the pet
    public String getName() {
        return name;
    }

    // returns the age of the pet
    public int getAge() {
        return age;
    }

    // returns the species of the pet
    public String getSpecies() {
        return species;
    }

    // returns a String representing the sound the pet makes
    abstract String makeSound();

    // returns a String describing what the pet eats
    abstract String eat();

}
