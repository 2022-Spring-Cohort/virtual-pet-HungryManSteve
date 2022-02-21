package virtual_pet;

import java.util.Random;

public class CatClass extends PetClass {
    Random random = new Random();

    boolean wild;
    int lives;


    public CatClass(boolean alive, String name) {
        super(alive, name);
        this.wild =  (random.nextBoolean());
        this.lives = (int) (Math.random() * 10 + 1);
        this.levelOfMeow = (int) (Math.random() * 10 + 1);
    }

    int levelOfMeow;





    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevelOfMeow(int levelOfMeow) {
        this.levelOfMeow = levelOfMeow;
    }


    public boolean isWild() {
        return wild;
    }

    public int getLives() {
        return lives;
    }

    public int getLevelOfMeow() {
        return levelOfMeow;
    }

@Override
    public String getStats(){
        return super.getStats() + " Wild: " + wild + " Lives: " + lives;
}

}
