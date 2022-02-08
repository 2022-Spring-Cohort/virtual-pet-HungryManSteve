package virtual_pet;

public class PetClass {
    boolean alive;
    String name;

    public PetClass(boolean alive, String name) {
        this.alive = alive;
        this.name = name;
    }

    public PetClass() {
        setAlive(true);
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
