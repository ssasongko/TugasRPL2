package composition;

/**
 *
 * @author Nur Sasongko 10119049
 */
public class Mobil {
    private String merekMobil;
    private Roda roda;

    public Mobil(String merekMobil, Roda roda) {
        this.merekMobil = merekMobil;
        this.roda = roda;
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
}
