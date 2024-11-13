public class Dog extends Pet {

    private String breed;

    // constructor
    public Dog(String name, int age, String species, String breed) {
        super(name, age, species); // Set attributes of Pet
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    String makeSound() {
        return "Dogs bark";
    }

    @Override
    String eat() {
        return "Dogs eat dog food";
    }

}
