import data.Pegawai;
import data.Perusahaan;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {

        Perusahaan perusahaanIT = new Perusahaan("IT Solutions", 100000000L);

        Pegawai JaneSmith = new Pegawai("Jane Smith", "Designer");
        Pegawai JohnDoe = new Pegawai("John Doe", "Programmer");
        Pegawai BobJohnson= new Pegawai("Bob Johnson", "Tester");
        Pegawai AliceBrown = new Pegawai("Alice Brown", "Project Manager");

        perusahaanIT.tambahPegawai(JohnDoe);
        perusahaanIT.tambahPegawai(JaneSmith);
        perusahaanIT.tambahPegawai(BobJohnson);
        perusahaanIT.tambahPegawai(AliceBrown);

        System.out.println("\nDaftar pegawai perusahaanIT: \n");
        perusahaanIT.printPegawai();

        System.out.println("\nSaldo Perusahaan sebelum menggaji pegawai: " + perusahaanIT.getSaldoPerusahaan() + "\n");

        perusahaanIT.gajiPegawai("Jane Smith", 5000000L);

        System.out.println("\nSaldo Perusahaan setelah menggaji pegawai: " + perusahaanIT.getSaldoPerusahaan());
    }
}