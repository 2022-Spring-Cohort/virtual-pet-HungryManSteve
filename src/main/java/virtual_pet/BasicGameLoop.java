package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;


public class BasicGameLoop {

    public static void gLoopStart() {
        Yoshi myYoshi = new Yoshi("Kevin", 75, 40, 7, "Red");
//        Yoshi randomYoshi = new Yoshi("Bruno",23, 24,34);
//        Yoshi Yoshi3 = new Yoshi("Steve", 34, 45,45);

        int whileToken = 1;
        int timeTick = 0;
        //whileToken helps repeating if user chooses anything other than feed, water, hug.


        while (whileToken != 0) {


//            System.out.println("I'm " + myYoshi.getName() + " . I have " + myYoshi.getHunger() + " hunger. " +
//                    "I have " + myYoshi.getBoredom() + " boredom. I have " + myYoshi.getThirst() + " thirst.");


            String blingText = "";
            for (int i = 0; i < 70; i++) {
                blingText += "*";
            }


            //Menu system layout
            System.out.println(blingText);

            System.out.println(
                    "Do you want to: \n" +
                            "[*] FEED \n" +
                            "[*] WATER \n" +
                            "[*] PLAY \n" +
                            "[*] ROFLcopter \n" +
                            "Type ? for more directions.");

            System.out.println(blingText);
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            System.out.println(answer);


            //This is where the user's inputs turn into actions.
            //Right now these are just tests.
            //This will loop until something stops it.

            if (answer.equalsIgnoreCase("feed")) {
                System.out.println("You fed the Yoshi");
                myYoshi.feed();
                myYoshi.drawGraphic();
            } else if (answer.equalsIgnoreCase("feedadopted")) {
                System.out.println("Feeding adopted");
                myYoshi.feed();

            } else if (answer.equalsIgnoreCase("water")) {
                System.out.println("You watered the Yoshi");
                myYoshi.water();

            } else if (answer.equalsIgnoreCase("hug")) {
                System.out.println("You hugged the Yoshi");
                myYoshi.play();


            } else if (answer.equalsIgnoreCase("roflcopter")) {
                ROFLcopter doThis = new ROFLcopter();
                ROFLcopter.mommy();
            } else if (answer.equals("?")) {
                System.out.println("By choosing feed, water, or hug you will raise the Yoshi's level of happiness!");

                //Put this if-statement in a while loop with a boolean if user chose feed, water, or hug.
            } else System.out.println("No.");
            myYoshi.tick();
            //System.out.println("Testing timeTick...");
            //System.out.println(timeTick);
            //whileToken--;
        }
    }
}