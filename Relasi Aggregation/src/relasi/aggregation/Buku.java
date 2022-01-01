package relasi.aggregation;
/**
 *
 * @author Nur Sasongko
 */
public class Buku {
    private String judulBuku;
    
    //buat konstruktor dari atribut yang akan ada
    public Buku(String judulBuku) {
        this.judulBuku = judulBuku;
    }    
    
    //buatlah getter dan setter sesuai dengan atribut yang akan ada
    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
}
