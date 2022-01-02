package relasi.aggregation;
import java.util.LinkedList;
/**
 *
 * @author Nur Sasongko
 */
public class RakBuku {
    private String merekRak;
    private LinkedList<Buku> buku;
    
    //buat konstruktor dari atribut yang akan ada
    public RakBuku(String merekRak) {
        this.merekRak = merekRak;
    }
    
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public String getMerekRak() {
        return merekRak;
    }

    public void setMerekRak(String merekRak) {
        this.merekRak = merekRak;
    }

    public LinkedList<Buku> getBuku() {
        return buku;
    }

    public void setBuku(LinkedList<Buku> buku) {
        this.buku = buku;
    }
}
