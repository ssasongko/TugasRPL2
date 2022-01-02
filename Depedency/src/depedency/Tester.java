package depedency;

/**
 *
 * @author Nur Sasongko 10119049
 */
public class Tester {
    public static void main(String[] args) {
        Bus bus = new Bus("10");
        Penumpang penumpang = new Penumpang("Budi");
        
        penumpang.naikBus(bus);
    }
    
}
