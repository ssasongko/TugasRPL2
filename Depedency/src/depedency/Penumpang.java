package depedency;

/**
 *
 * @author Nur Sasongko 10119049
 */
public class Penumpang {
    private String namaPenumpang;

    public Penumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }
    
    public void naikBus(Bus bus){
        // depedensi
        System.out.println(namaPenumpang);
        System.out.println(bus.getNomorBus());
    }
}
