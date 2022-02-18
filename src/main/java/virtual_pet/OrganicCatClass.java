package virtual_pet;

public class OrganicCatClass extends CatClass implements Organic{
    int thirst;
    int hunger;
    int boredom;

    public OrganicCatClass(boolean alive, String name) {
        super(alive, name);
        this.thirst = (int) (Math.random() * 100 + 1);
        this.hunger = (int) (Math.random() * 100 + 1);
        this.boredom = (int) (Math.random() * 100 + 1);
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



    @Override
    public String getStats(){
        return super.getStats() + " Thirst Level: " + thirst + " Hunger Level: " + hunger + " Boredom Level: " + boredom;
    }




    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }


    public void water() {
        if (this.thirst - 100 <= 0){
            thirst = 0;
        }
        else thirst -= 100;
    }
    public void feed() {
        if (this.hunger - 100 <= 0) {
            hunger = 0;
        }
        else hunger -= 100;
    }
    public void play() {
        if (this.boredom - 100 <= 0){
            boredom = 0;
        }

        else boredom -= 100;
    }
}
