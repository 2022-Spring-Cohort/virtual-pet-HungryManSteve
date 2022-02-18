package virtual_pet;

public class OrganicDogClass extends DogClass implements Organic{
    int thirst;
    int hunger;
    int boredom;
    boolean tailWagging;

    public OrganicDogClass(boolean alive, String name, String breed, boolean tailWagging) {
        super(alive, name, breed);
        this.thirst = (int) (Math.random() * 100 + 1);
        this.hunger = (int) (Math.random() * 100 + 1);
        this.boredom = (int) (Math.random() * 100 + 1);
        this.tailWagging = tailWagging;
    }

    @Override
    public String getStats(){
        return super.getStats() + "Thirst Level: " + thirst + " Hunger Level: " + hunger + " Boredom Level: " + boredom + " Tail Wagging? " + tailWagging;
    }




    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setTailWagging(boolean tailWagging) {
        this.tailWagging = tailWagging;
    }





    public boolean isTailWagging() {
        return tailWagging;
    }


    @Override
    public void feed() {
        hunger--;
    }

    @Override
    public void water() {
        thirst--;
    }

    @Override
    public void play() {
        boredom--;
    }
    public void tick(){
        boredom++;
        hunger++;
        thirst++;
    }
}
