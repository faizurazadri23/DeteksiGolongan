package Golongan;

import java.util.Scanner;

public class DeteksiGolongan {
    
    public static void main(String[] args) {

        System.out.println("==================");
        System.out.println("Selamat Datng Di Aplikasi Pengecekan Golongan Usia");

        String nama, alamat, golongan = "";
        int umur;

        Scanner scanner = new Scanner(System.in);

        System.out.println("====Pendaataan Data Pengguna===");
        System.out.println("Nama : ");
        nama = scanner.nextLine();

        System.out.println("Alamat : ");
        alamat = scanner.nextLine();

        System.out.println("Usia : ");
        umur = scanner.nextInt();

        if (umur >= 5 && umur <= 11) {
            golongan = "Kana-Kanak";
        } else if (umur >= 12 && umur <= 25) {
            golongan = "Remaja";
        } else if (umur >= 26 && umur <= 45) {
            golongan = "Dewasa";
        } else if (umur >= 46 && umur <= 65) {
            golongan = "Lansia";
        }

        System.out.println("====Data Anda======");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia " + umur + "Tahun");
        System.out.println("Golongan : " + golongan);

    }
}
