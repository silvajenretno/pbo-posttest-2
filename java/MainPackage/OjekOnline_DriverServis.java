package MainPackage;

/**
 *
 * @author Silva_Jen_Retno
 */

import NewPackage.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OjekOnline_DriverServis {

    private List<Driver> drivers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    // Getter untuk properti riders
    public List<Driver> getDrivers() {
        return drivers;
    }
    
    // Setter untuk properti riders
    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    
     // Getter untuk properti scanner
    public Scanner getScanner() {
        return scanner;
    }
    
    // Setter untuk properti scanner
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
    public void addDriver() {
        System.out.print("Nama Driver : ");
        String name = scanner.next();
        System.out.print("Umur Driver : ");
        int age = scanner.nextInt();

        Driver driver = new Driver(name, age);
        drivers.add(driver);
        System.out.println("Driver berhasil ditambahkan.");
    }

    public void editDriver() {
        System.out.print("Indeks Driver yang akan diubah: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= drivers.size()) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        Driver driver = drivers.get(index);

        System.out.print("Nama Driver baru: ");
        String name = scanner.next();
        System.out.print("Umur Driver baru: ");
        int age = scanner.nextInt();

        driver.setName(name);
        driver.setAge(age);

        System.out.println("Driver berhasil diubah.");
    }

    public void deleteDriver() {
        System.out.print("Indeks Driver yang akan dihapus: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= drivers.size()) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        Driver driver = drivers.remove(index);
        System.out.println("Driver berhasil dihapus: " + driver.getName());
    }

    public void displayDriver() {
        System.out.println("Data Driver :");
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(i + ". " + drivers.get(i));
        }
    }
}
