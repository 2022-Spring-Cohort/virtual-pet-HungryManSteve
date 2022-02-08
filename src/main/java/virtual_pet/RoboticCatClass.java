package virtual_pet;

public class RoboticCatClass extends CatClass implements Robot{
    int charge;



    boolean softwareUpdate;
    int oil;

    public RoboticCatClass(boolean alive, String name, boolean softwareUpdate) {
        super(alive, name);
        this.charge = (int) (Math.random() * 100 + 1);
        this.softwareUpdate = softwareUpdate;
        this.oil = (int) (Math.random() * 100 + 1);
    }


    public void setCharge(int charge) {
        this.charge = charge;
    }

    public void setSoftwareUpdate(boolean softwareUpdate) {
        this.softwareUpdate = softwareUpdate;
    }

//    public void setOil(int oil) {
//        this.oil = oil;
//    }


    public int getCharge() {
        return charge;
    }

    public boolean isSoftwareUpdate() {
        return softwareUpdate;
    }

    public int getOil() {
        return oil;
    }


    public void softWareUpdate(){
        softwareUpdate = true;
    }

    @Override
    public void oil() {
        oil = 100;
    }

    @Override
    public void charge() {
        charge--;
    }
}
