package virtual_pet;

public class DogClass extends PetClass{
    int levelOfBark;
    String breed;

    public DogClass(boolean alive, String name, String breed) {
        super(alive, name);
        this.levelOfBark = (int) (Math.random() * 101);
        this.breed = breed;
    }

    public DogClass(int levelOfBark) {
        this.levelOfBark = levelOfBark;
    }

    public void setLevelOfBark(int levelOfBark) {
        this.levelOfBark = levelOfBark;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }




    public int getLevelOfBark() {
        return levelOfBark;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String getStats(){
        return super.getStats() + " Bark level: " + levelOfBark + " Breed Type: " + breed;
    }

}
