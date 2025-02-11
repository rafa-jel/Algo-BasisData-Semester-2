import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukan Nilai Tugas : "); nilaiTugas = sc.nextInt();
        System.out.print("Masukan Nilai Kuis : "); nilaiKuis = sc.nextInt();
        System.out.print("Masukan Nilai UTS : "); nilaiUTS = sc.nextInt();
        System.out.print("Masukan Nilai UAS : "); nilaiUAS = sc.nextInt();
        System.out.println("==============================");

        if (nilaiKuis < 0 || nilaiKuis > 100 || nilaiTugas < 0 || nilaiTugas > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("==============================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
        }
        else {
            nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS) / 4;
            if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                nilaiHuruf = "D";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                nilaiHuruf = "C";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                nilaiHuruf = "B";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                nilaiHuruf = "A";
                System.out.println("==============================");
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                System.out.println("Nilai Huruf : " + nilaiHuruf);
                System.out.println("==============================");
            }
            System.out.println("==============================");
            if (nilaiAkhir > 50) {
                System.out.println("Selamat Anda Lulus!");
            }else if (nilaiAkhir <= 50) {
                System.out.println("Maaf Anda Tidak Lulus");
            }
        }
    }
}