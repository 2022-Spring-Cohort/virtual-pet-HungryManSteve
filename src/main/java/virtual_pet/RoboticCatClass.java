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
    @Override
    public String getStats(){
        return super.getStats() + " Oil Level: " + oil + " Charge Level: " + charge;
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
    public void oilUp() {
        oil = 100;
    }

    @Override
    public void chargeUp() {
        charge = 100;
    }

    @Override
    public void chargeDown() { charge -= 20; }

    public void tick(){
        charge--;
        oil--;
    }
}
