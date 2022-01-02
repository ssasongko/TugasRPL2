package composition;
/**
 *
 * @author Nur Sasongko 10119049
 */
public class Tester {
    public static void main(String[] args) {
        //instansiasi objek dari kelas yang dibutuhkan
        //merek mobil: BMW; merek roda: BridgeStone
        //relasikan dua kelas tersebut dalam bentuk composition
        Mobil mobil = new Mobil("BMW", new Roda("BridgeStone")); // Composition
        
        //tampilkan merek mobil dan merek roda
        System.out.println(mobil.getMerekMobil());
        System.out.println(mobil.getRoda().getMerekRoda());
    }
}
