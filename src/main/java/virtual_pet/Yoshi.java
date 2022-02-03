package virtual_pet;

public class Yoshi {

    public String color;
    public String name;
    public int hunger;
    public int boredom;
    public int thirst;



    public String favoriteFood;



    public Yoshi(String name, int hunger, int boredom, int thirst, String color) {
        //Constructors


        this.color = color;
        this.boredom = boredom;
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public String getFavoriteFood() { return favoriteFood; }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getThirst() {
        return thirst;
    }

    public String getColor() { return color; }



//    public void greeting() {
//        System.out.println("Hi I am "  + "!");
//        System.out.println(
//                "*****"+name+" Stats***************\n" +
//                "Hunger level: " +hunger+"\n"+
//                "Boredom level: "+boredom+"\n"+
//                "Thirst level: " +thirst+ "\n"
//        );



    public void tick() {

        hunger++;
        thirst++;
        boredom++;

    }

    public void feed() {
        if (this.hunger - 100 <= 0) {
        hunger = 0;
        }
        else hunger -= 100;
        //drawGraphic();

    }

    public void water() {
        if (this.thirst - 100 <= 0){
            thirst = 0;
        }
        else thirst -= 100;

    }

    public void play() {
    if (this.boredom - 100 <= 0){
            boredom = 0;
        }

        else boredom -= 100;
    }
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void  drawGraphic() {
//
//
//
        System.out.print(
                ANSI_YELLOW +
                            "░░░░░░░░░░░░░░░░░░░░"
                        + "\n░░░░░░▄▀▀▄▀▀▄░░░░░░░"
                        + "\n░░░░░█▒▄░▄░░▒█▄▄▄░░░"
                        + "\n░░░▄▄█░▀░▀░░░█▄▓▓█░░"
                        + "\n░▄▀▒▒▒▀▄▀▄▄▄▀▒▒▀█▓▄"
                        + "\n▄▀▀▒▀▒▒▒▒▒░░░▒▒▒█▓▓█"
                        + "\n█▒▒▒▒▒▒▒▒▄░░░░▒▒██▀"
                        + "\n▀▄▒▒▒▒▒▒▒█▀░░▒▄█▄▀░░"
                        + "\n░░▀▀▄▄▄▄█▄░░▒▒▀▄█▄▄░"

        + ANSI_RESET
        );
        System.out.println(" ");
    }}

//    void String ("")
//
//}



