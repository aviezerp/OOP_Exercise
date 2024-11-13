import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {

        System.out.println("Hi!\n");
        // Use lists to manage the pets and display them

        Dog d1 = new Dog("Jacky", 5, "Labrador", "Retriever");
        Dog d2 = new Dog("Pinki", 5, "Poodle", "moodle");
        Dog d3 = new Dog("Wendy", 5, "Golden", "Retriever");

        Cat c1 = new Cat("Mitzi", 3, "Ragdoll", "Black");
        Cat c2 = new Cat("Pitzi", 5, "Persian", "Yellow");
        Cat c3 = new Cat("Puss", 4, "Sphynx", "Brown");

        List<Pet> pets = new ArrayList<>(); // List of pets
        pets.add(d1);
        pets.add(c1);
        pets.add(d2);
        pets.add(c2);
        pets.add(d3);
        pets.add(c3);

        // printPets(pets);

        GeneralVeterinarian generalVeterinarian = new GeneralVeterinarian("Peter");
        SpecialistVeterinarian specialistVeterinarian = new SpecialistVeterinarian("Mark", "dog expert");

        String resPeter = generalVeterinarian.examinePet(d1);
        String resMark = specialistVeterinarian.examinePet(c1);
        // System.out.println(resPeter + '\n');
        System.out.println(resMark + '\n');

    }

    // Method gets list of pets. For each pet, prints pet attributes.
    public static void printPets(List<Pet> pets) {
        if (pets.isEmpty()) {
            System.out.println("Pets list is empty");
        } else {
            for (Pet pet : pets) {
                System.out.println("name: " + pet.getName());
                System.out.println("age: " + pet.getAge());
                System.out.println("species: " + pet.getSpecies());
                if (pet instanceof Dog) {
                    System.out.println("breed: " + ((Dog) pet).getBreed());
                }
                if (pet instanceof Cat) {
                    System.out.println("color: " + ((Cat) pet).getColor());
                }
                System.out.println("makeSound: " + pet.makeSound());
                System.out.println("pet food: " + pet.eat() + "\n");
            }

        }
    }
}
