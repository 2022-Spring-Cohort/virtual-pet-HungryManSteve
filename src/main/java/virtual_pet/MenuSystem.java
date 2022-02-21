package virtual_pet;

import java.util.Scanner;

public class MenuSystem{
    Scanner scan = new Scanner(System.in);



    public String menuSystem() {

        return new String("What do you wish to do today? \n" +
                "[*] Feed\n" +
                "[*] Water\n" +
                "[*] Play\n" +
                "[*] Charge\n" +
                "[*] Add\n" +
                "[*] Adopt\n" +
                "[*] Clean\n" +
                "[*] Walko\n" +
                "[*] Walkr\n" +
                "[*] Stats");

    }
//    CageOrganic _cageOrganic = new CageOrganic();
    public String cageCleanLevel(){
        return new String("Cage's clean level: " + _cageOrganic.getCageClean());

    }

    public void menuLogic(String answer) {
        var _cageOrganic = new CageOrganic();
        //passing answer from virtual_pet.GameLoop
        if (answer.equalsIgnoreCase("feed")) {
            _petShelter.petFeeder();
            System.out.println("You fed the pet");
        }
        //Lower hunger
        else if (answer.equalsIgnoreCase("water")) {
            _petShelter.petWater();
            System.out.println("You watered the pet");
            //Lower charge counter
        } else if (answer.equalsIgnoreCase("Play")) {
            _petShelter.petPlay();
            System.out.println("You played with the pet");
            //Lower boredom stats
        } else if (answer.equalsIgnoreCase("charge")) {
            _petShelter.petCharge();
            System.out.println("You charged the pet");
            //Add to charge counter
        } else if (answer.equalsIgnoreCase("Add")) {
            System.out.println("What do you want to name your pet?");
            String petName = scan.nextLine();
            System.out.println("What type of pet are you adding?");
            System.out.println("Organic Cat \t Robotic Cat \t virtual_pet.Organic Dog \t Robotic Dog");
            System.out.println("OC\t\t\t\t RC\t\t\t\t OD\t\t\t\t RD\t\t\t\t");
            String petType = scan.nextLine();
            _petShelter.petAdder(petName, petType);

            System.out.println("You added a pet");

        } else if (answer.equalsIgnoreCase("Adopt")) {
            _petShelter.petRemoval();
            String stringToInt = scan.nextLine();
            _petShelter.petRemoval2(stringToInt);
            System.out.println("Your pet got adopted");
            //Remove pet
        } else if (answer.equalsIgnoreCase("stats")) {
            _petShelter.petStats();
            //had to use constructor to "move over" class
            //now using _petShelter as a _private class
            System.out.println("You see the pet stats");
        }else if (answer.equalsIgnoreCase("clean")){
            _petShelter.deepClean();
            System.out.println("You cleaned the cages.");

        }else if (answer.equalsIgnoreCase("walko")){

            System.out.println("You walked the Dogs");
            _petShelter.smallClean();
        }else if (answer.equalsIgnoreCase("walkr")){
            System.out.println("You walked the Robots??");
            _petShelter.petChargeDown();

        }


        else System.out.println("No.");
    }




    private  String answer = "abc";
    private String _text;
    private PetShelter _petShelter;
    private CageOrganic _cageOrganic;



    public MenuSystem(PetShelter petShelter) {
        _petShelter = petShelter;
        //passing gameloop petshelter here
    }



    public String gootTooxt(){
        return _text.toUpperCase();
    }
    public String yabbaDabba(){
        return _text.toLowerCase();
    }

    public static String yolo(){
        return "YOLO.";
    }


}

