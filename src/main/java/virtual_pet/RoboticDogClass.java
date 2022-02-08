package virtual_pet;

public class RoboticDogClass extends DogClass implements Robot{
    int oil;

    public RoboticDogClass(boolean alive, String name, String breed, boolean softwareUpdate) {
        super(alive, name, breed);
        this.oil = (int) (Math.random() * 100 + 1);
        this.softwareUpdate = softwareUpdate;
        this.charge = (int) (Math.random() * 100 + 1);
    }



    boolean softwareUpdate;
    int charge;





    public void setOil(int oil) {
        this.oil = oil;
    }
    public int getOil() {
        return oil;
    }

    public boolean isSoftwareUpdate() {
        return softwareUpdate;
    }

    public int getCharge() {
        return charge;
    }


    @Override
    public void oil() {

    }

    @Override
    public void charge() {

    }
}
