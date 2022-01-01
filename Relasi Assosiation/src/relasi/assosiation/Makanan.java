package relasi.assosiation;
/**
 * 
 * @author Nur Sasongko
 */
public class Makanan {
    private String namaMakanan;
    
    private Provinsi provinsi;
    
    public Makanan(String namaMakanan){
        this.namaMakanan=namaMakanan;
    }

    // getter and setter
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }
}
