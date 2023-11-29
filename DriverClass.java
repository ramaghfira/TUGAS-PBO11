import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exception Handling
        try {
            System.out.print("Masukkan No. Faktur: ");
            String noFaktur = scanner.next();
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.next();
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.next();
            System.out.print("Masukkan Harga Barang: ");
            int hargaBarang = scanner.nextInt();
            System.out.print("Masukkan Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();
            if (hargaBarang <= 0 || jumlahBarang <= 0) {
                throw new InvalidInputException("Harga dan jumlah barang harus lebih dari 0.");
            }
            // Membuat objek Barang
            Barang barang = new Barang(namaBarang, hargaBarang, jumlahBarang);
            // Membuat objek Faktur
            Faktur faktur = new Faktur(noFaktur, namaPelanggan, barang);
            // Menampilkan informasi faktur
            faktur.tampilkanInfoFaktur();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka untuk harga dan jumlah barang.");
        } catch (InvalidInputException e) {
            System.out.println("Input tidak valid: " + e.getMessage());
        } finally {
            // Tutup scanner setelah selesai
            scanner.close();
        }
    }
}