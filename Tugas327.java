import java.util.Scanner;

public class Tugas327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko (minimal 1): ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1;
            int tokoTerbaik = 1;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("Toko " + i);
                System.out.print("  Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();
                
                int totalBarangToko = 0;
                
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int barangPelanggan = sc.nextInt();
                    totalBarangToko += barangPelanggan;
                }
                
                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                
                totalBarangSeluruhToko += totalBarangToko;
                
                if (totalBarangToko > maxBarangToko) {
                    maxBarangToko = totalBarangToko;
                    tokoTerbaik = i;
                }
                
                System.out.println();
            }
            
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        
        sc.close();
    }
}