package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class YoshiShelter {
    ArrayList<Yoshi> listYoshi = new ArrayList<>();

    public YoshiShelter() {
        //starter yoshis
        listYoshi.add(new Yoshi("Baha", 34, 34, 34, "green"));
        listYoshi.add(new Yoshi("Steve", 34, 45, 45, "blue"));
        listYoshi.add(new Yoshi("Bruno", 23, 24, 34, "white"));
        listYoshi.add(new Yoshi("Dave", 34, 45, 45, "yellow"));
    }

    public void addYoshi(Yoshi yoshi) {
        listYoshi.add(yoshi);
    }


    public void yoshiStatus() {
        System.out.println("=====YOSHI STATS======");
        for (Yoshi currentYoshi : listYoshi) {
            System.out.println(":D Hi I am " + currentYoshi.getName() + "!");
//I want to add an emotion at the end with an emoji
            System.out.println(
                    "----" + currentYoshi.name + " Stats\n" +
                            "************** //****  /*\\  ****\\\\  **************  \n" +
                            "Hunger: " + currentYoshi.hunger + "\t" +
                            "Boredom: " + currentYoshi.boredom + "\t" +
                            "Thirst: " + currentYoshi.thirst + "\t" +
                            "Color: " + currentYoshi.color);
        }
    }
//public void connectYoshiColor(

//        for (Yoshi currentYoshi: listYoshi.) {
//            if (currentYoshi.color.equalsIgnoreCase("yellow")) {
//                Yoshi.drawGraphic();
//            }
//        }

    public void tickAllYoshi() {
        for (Yoshi currentYoshi : listYoshi) {
            currentYoshi.tick();
        }

    }

    public void feedAllYoshi() {
        for (Yoshi currentYoshi : listYoshi) {
            currentYoshi.feed();
        }
    }

    public void waterAllYoshi() {
        for (Yoshi currentYoshi : listYoshi) {
            currentYoshi.water();
        }
    }

    public void playAllYoshi() {
        for (Yoshi currentYoshi : listYoshi) {
            currentYoshi.play();
        }
    }


    public void removeYoshi(String name) {
        Yoshi foundYoshi = null;
        for (Yoshi currentYoshi : listYoshi) {
            if (name.equalsIgnoreCase(currentYoshi.getName())) {
                foundYoshi = currentYoshi;
            }
        }
        if (foundYoshi != null) {
            listYoshi.remove(foundYoshi);

        }
    }


}







