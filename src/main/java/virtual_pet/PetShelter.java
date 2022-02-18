package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShelter {
    ArrayList<PetClass> listPet = new ArrayList<>();
    String petName = null;
    Boolean petBool = null;


    public void petShelterDefault() {
        listPet.add(new OrganicDogClass(true, "Barry", "Border Collie", true));
        listPet.add(new RoboticDogClass(true, "C-17", "Roomba", false));
        listPet.add(new OrganicCatClass(true, "Pebbles"));
        listPet.add(new RoboticCatClass(true, "KillBot: KittyFriend", true));
        System.out.println("Test");
    }

    public void petStats() {
        System.out.println("=====PET STATS======");
        for (PetClass currentPet : listPet) {
            int i = 0;
            i = listPet.indexOf(currentPet);
            i++;
            System.out.println(i + currentPet.getStats());

            //add numbers to assign to pets (i-loop maybe?)
        }
    }

    public void petRemoval() {
        //part 1 of 2
        System.out.println("Which pet should be adopted? Use number.");
        for (PetClass currentPet : listPet) {
            int i = listPet.indexOf(currentPet);
            i++;
            System.out.println(i + ". " + currentPet.getName());
        }
    }

    // Function to convert String to integer
    public static int convert(String str) {
        int val = 0;

        // Convert the String
        try {
            val = Integer.parseInt(str);
        } catch (NumberFormatException e) {

            // This is thrown when the String
            // contains characters other than digits
            System.out.println("Invalid String");
        }
        return val;
    }


    public void petRemoval2(String stringToInt) {
        int answerInt = convert(stringToInt);
        //Trying convert method for funsies
        System.out.println("You had " + listPet.size() + " pets!");
        if (answerInt <= (listPet.size())) {
            listPet.remove(answerInt - 1);
        } else System.out.println("No.");
        System.out.println("You have " + listPet.size() + " pets!");
    }

    public void petAdder(String petName, String petType) {
        Scanner scan = new Scanner(System.in);
        if (petType.equalsIgnoreCase("OC")) {
            listPet.add(new OrganicCatClass(true, petName));
        } else if (petType.equalsIgnoreCase("RC")) {
            listPet.add(new RoboticCatClass(true, petName, false));
        } else if (petType.equalsIgnoreCase("RD")) {
            listPet.add(new RoboticDogClass(true, petName, "Roomba", false));
        } else if (petType.equalsIgnoreCase("OD")) {
            String breed;
            System.out.println("What kind of breed is this dog?");
            breed = scan.nextLine();
            listPet.add(new OrganicDogClass(true, petName, breed, true));

        }

    }


    public void petFeeder() {
        for (PetClass currentPet : listPet) {
            if (currentPet instanceof Organic)
                ((Organic) currentPet).feed();
        }
    }

    public void petWater() {
        for (PetClass curentPet : listPet) {
            if (curentPet instanceof Organic)
                ((Organic) curentPet).water();
        }
    }

    public void petPlay() {
        for (PetClass curentPet : listPet) {
            if (curentPet instanceof Organic)
                ((Organic) curentPet).play();
        }
    }

    public void petCharge() {
        for (PetClass currentPet : listPet) {
            if (currentPet instanceof Robot)
                ((Robot) currentPet).chargeUp();
        }
    }

    public void petTick() {
        for (PetClass currentPet : listPet) {
                currentPet.tick();

            }
        }}














