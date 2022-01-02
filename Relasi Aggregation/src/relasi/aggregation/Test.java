package relasi.aggregation;

import java.util.LinkedList;

/**
 *
 * @author Nur Sasongko
 */
public class Test {

    public static void main(String[] args) {
        //instansiasi objek dari kelas yang dibutuhkan
        //merek rak: Olympic; judul buku: Harry Potter
        LinkedList<Buku> listBuku = new LinkedList<>();
        RakBuku rakBuku = new RakBuku("Olympic");
        
        listBuku.add(new Buku("Harry Potter"));
        
        //relasikan dua kelas tersebut dalam bentuk aggregation
        rakBuku.setBuku(listBuku);
              
        //tampilkan merek rak dan judul buku
        System.out.println(rakBuku.getMerekRak());
        for(Buku book : listBuku){
            System.out.println(book.getJudulBuku());
        }
    }
}
