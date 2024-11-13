public class Cat extends Pet {

    private String color;

    // constructor
    public Cat(String name, int age, String species, String color) {
        super(name, age, species); // Set attributes of Pet
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    String makeSound() {
        return "Cats meow";
    }

    @Override
    String eat() {
        return "Cats eat cat food";
    }
}
