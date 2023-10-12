package MainPackage;
/**
 *
 * @author Silva_Jen_Retno
 */
import java.util.Scanner;

public class OjekOnlineAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OjekOnline_DriverServis driverServis = new OjekOnline_DriverServis();

        while (true) {
            System.out.println("^.^ Selamat Datang Di Aplikasi Ojek Online RocketRide ^.^");
            System.out.println("Silahkan Pilih Menu Dibawah ini Untuk Mengedit Data Driver ^.^");
            System.out.println("1. Tambah Driver");
            System.out.println("2. Edit Driver");
            System.out.println("3. Hapus Driver");
            System.out.println("4. Tampilkan Data Driver");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    driverServis.addDriver();
                    break;
                case 2:
                    driverServis.editDriver();
                    break;
                case 3:
                    driverServis.deleteDriver();
                    break;
                case 4:
                    driverServis.displayDriver();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
