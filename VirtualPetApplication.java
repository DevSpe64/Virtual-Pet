import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner setup = new Scanner(System.in);

        System.out.println("Welcome to TomaNOTchi");

        System.out.println("What would you like to name your pet?");

        String petName = setup.nextLine();

        VirtualPet pet = new VirtualPet(0, 0, 0, 100, 0, petName);

        while (true) {
            System.out.println("\n" + pet.getName() + "'s status:");
            System.out.println("Age: " + pet.getAge() + "Yr's Old");
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Affection: " + pet.getAffection());
            System.out.println("Thirst:" + pet.getThirst());
            System.out.println("Sleepyness: " + pet.getSleepyness());

            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Feed your pet");
            System.out.println("2. Play with your pet");
            System.out.println("3. Fill your pet's water bowl");
            System.out.println("4. Give your pet a nap");
            System.out.println("5. Quit the game");

            int choice = setup.nextInt();
            setup.nextLine();

            pet.time();

            switch (choice) {
                case 1:
                    pet.feed();
                    System.out.println("\nYou fed " + pet.getName());
                    break;
                case 2:
                    pet.play();
                    System.out.println("\n" + pet.getName() + " played with you.");
                    break;
                case 3:
                    pet.hydrate();
                    System.out.println("\n" +pet.getName() + " has been hydrated");
                    break;
                case 4:
                    pet.sleep();
                    System.out.println("\n" + pet.getName() + " took a nap");
                    break;
                case 5:
                    System.out.println("\nThanks for playing! Goodbye.");
                    System.exit(0);
                    setup.close ();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (pet.getHunger() == 100) {
                System.out.println("\nYour pet has starved to death");
            } else if (pet.getThirst() == 100) {
                System.out.println("\n Your pet has died of dehydration");
            } else if (pet.getSleepyness() == 100) {
                System.out.println("\nYour pet took a 'forever nap'");
            } else if (pet.getAffection() == 0) {
                System.out.println("Your pet died of a broken heart ;(");
            }

            if (pet.getHunger() == 100 || pet.getThirst() == 100 || pet.getSleepyness() == 100
                    || pet.getAffection() == 0) {
                System.out.println("\n" + pet.getName() + "'s status:");
                System.out.println("Age: " + pet.getAge() + "Yr's Old");
                System.out.println("Hunger: " + pet.getHunger());
                System.out.println("Affection: " + pet.getAffection());
                System.out.println("Thirst:" + pet.getThirst());
                System.out.println("Sleepyness: " + pet.getSleepyness() + "\n");
                System.out.println(pet.getName() + " has lived to " + pet.getAge() + " Yr's Old!\n");
                System.out.println("Play again and try to raise you pet to a higher age");
                setup.close();
                System.exit(0);
            }
        }

    }

}
