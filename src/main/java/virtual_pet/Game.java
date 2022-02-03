package virtual_pet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    //Yoshi myVirtualPet = new Yoshi("Kevin", 75, 40, 7);



    public void playStart() {
//        System.out.println("This is inside the game class.");
//        System.out.println("You have 3 Yoshis, take care of them!");
//        System.out.println("What do you want to do?");


        //timeTick is a measure of how many turns have passed. It will increment after every major event.

        BasicGameLoop gLoop1 = new BasicGameLoop();
        BasicGameLoop.gLoopStart();

        //This is outside the game while loop.


    }

}
