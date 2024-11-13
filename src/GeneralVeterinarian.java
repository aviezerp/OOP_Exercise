public class GeneralVeterinarian implements Veterinarian {

    private String name;

    GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name; // returns the name of the veterinarian
    }

    @Override
    public String examinePet(Pet pet) {
        // returns a String describing the general examination of the pet
        return "After examination of " + pet.getName() + ", Veterinarian " + name + " says that " + pet.getName()
                + " will be ok, just needs a little more sleep\n";
    }
}