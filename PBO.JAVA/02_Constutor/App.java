// class polos atau tanpa construtor
class polos {
    //stribut objek 
    String datastring;
    int datainteger;
}
// class dengan construtor
class mahasiswa{
    // altribut
    String nama;
    String nim;
    String prodi;
    

    //construtor
    //namanya sama dengan class
    //tidak memiliki retrun velue/nilai balik
    //method yang pertama kali dipanggil saat objek pertama kali di
    mahasiswa(String inputNama,String inputnNIM,String inputProdi){

        // mengisi data 
        nama = inputNama;
        nim = inputnNIM;
        prodi = inputProdi;

        // Mencetak data
        System.out.println("nama mahasiswa : " + nama ); 
        System.out.println("NIM : " + nim);
        System.out.println("prodi : " + prodi);



    }


}
public class App {
    public static void main(String[] args) throws Exception {
        //pembuatan objek atau instensiasi objek
        polos polos_1 = new polos();

        //isi altribut 
        polos_1.datastring = "polos";
        polos_1.datainteger = 10;

        // catat objek 
        System.out.println(polos_1.datastring);
        System.out.println(polos_1.datainteger);

        //pembuatan objek mahasiswa 
        mahasiswa mhs_1 =  new mahasiswa("ipan", "23241053", "pti");

    }
}