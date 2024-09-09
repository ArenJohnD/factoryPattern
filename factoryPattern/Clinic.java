package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            int choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd"); // Corrected breed spelling

                    System.out.println("Pet ID: " + petFile.getPetId());
                    System.out.println("Pet name: " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    System.out.println("Dog Breed: " + ((Dog) pet).getBreed());

                    System.out.println();
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);

                    System.out.println("Pet ID: " + petFile.getPetId());
                    System.out.println("Pet name: " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Program Terminated");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}
