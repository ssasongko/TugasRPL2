package relasi.assosiation;
/**
 * 
 * @author Nur Sasongko 10119049
 */
public class Provinsi {
    private String namaProvinsi;
   
    private Makanan makanan;
    
    public Provinsi(String namaProvinsi){
        this.namaProvinsi=namaProvinsi;
    }
    
    //buat getter dan setter
    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    public void setNamaProvinsi(String namaProvinsi) {
        this.namaProvinsi = namaProvinsi;
    }
}
