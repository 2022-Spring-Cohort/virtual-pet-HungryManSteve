package virtual_pet;

public class CageOrganic {
    int cageClean = 0;

    public CageOrganic() {
        this.cageClean = cageClean;
    }

    public int getCageClean() {
        return cageClean;
    }

    public void setCageClean(int cageClean) {
        this.cageClean = cageClean;
    }


    public void tick() {
        this.cageClean += 5;
    }
    public void deepClean() {
        this.cageClean -= 20;
    }
}
