
package latihan_pertemuan_6;

import java.util.Scanner;

/**
 * NAMA              : Lutfia Wulandari
 * KELAS             : PBO12
 * NIM               : 23176008
 * PRODI             : Sistem Informasi
 * SEMESTER          : 3
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program           : Ejaan nama
 */
public class Latihan_25 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        
        // Melakukan perulangan untuk setiap huruf dalam nama
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        // Menutup scanner
        scanner.close();
        
        System.out.println("BUILD SUCCESSFUL");
    }
}
