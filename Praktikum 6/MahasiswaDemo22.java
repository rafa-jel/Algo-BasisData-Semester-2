import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for(int i = 0; i<jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i + 1));
            System.out.print("NIM : "); String nim = sc.nextLine();
            System.out.print("Nama : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK : "); String ip = sc.nextLine(); Double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------------------");
            list.tambah (new Mahasiswa22(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("----------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK : "); 
        Double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
