package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {

        YoshiShelter myShelter = new YoshiShelter();

        while (true) {
            myShelter.yoshiStatus();

            String blingText = "";
            for (int i = 0; i < 80; i++) {
                blingText += "*";
            }
            //Menu system layout
            System.out.println(blingText);

            System.out.println(
                    "\tDo you want to: " +
                            "\n[*] FEED " +
                            "\n[*] WATER " +
                            "\n[*] PLAY " +
                            "\n[*] ADD " +
                            "\n[*] ADOPT " +
                            "\n[*] to be announced " +
                            "\n[*] FLEX WITH COLOR" +
                            "\n[*] ROFLcopter " +
                            "\nType ? for more directions.");

                    System.out.println(blingText);
                    Scanner scan = new Scanner(System.in);
                    String answer = scan.nextLine();

                    if (answer.equalsIgnoreCase("feed")) {
                        System.out.println("You fed the Yoshi");
                        myShelter.feedAllYoshi();}
//                        myShelter.drawGraphic();}

                    else if (answer.equalsIgnoreCase("play")){
                        System.out.println("You played with the Yoshi");
                        myShelter.playAllYoshi();
                    }
                    else if (answer.equalsIgnoreCase(("FLEX"))){
                        Yoshi.drawGraphic();
                    }
                     else if (answer.equalsIgnoreCase("water")) {
                        System.out.println("You watered the Yoshi");
                        myShelter.waterAllYoshi();}
                     else if (answer.equalsIgnoreCase("adopt")){
                        System.out.println("Who do you wish to adopt?");
                        myShelter.removeYoshi(scan.nextLine());
                    }
                     else if(answer.equalsIgnoreCase("add")){
                        System.out.println("What do you want to call this Yoshi?");
                    myShelter.addYoshi(new Yoshi(scan.nextLine(),50,50,50,"neon green"));
                    }
                     else if (answer.equalsIgnoreCase("roflcopter")){
                        ROFLcopter doThis = new ROFLcopter();
                        ROFLcopter.mommy();
                    }
                    else if (answer.equals("?")) {
                        System.out.println("By choosing feed, water, or hug you will raise the " +
                                "Yoshi's level of happiness!");
                    }
                    else System.out.println("No.");
                    myShelter.tickAllYoshi();

        }
    }
}

