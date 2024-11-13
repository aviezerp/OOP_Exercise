public class SpecialistVeterinarian implements Veterinarian {

    private String name;
    private String specialty;

    // constructor
    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name; // returns the name of the veterinarian
    }

    @Override
    public String examinePet(Pet pet) {
        // returns a String describing the specialized examination of the pet
        return "After examination of " + pet.getName() + ", " + specialty + ", Specialist Veterinarian " + name
                + " says that "
                + pet.getName()
                + " will be just fine, just needs a little more home care\n";
    }
}
