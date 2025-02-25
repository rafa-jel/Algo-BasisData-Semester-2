import java.util.Scanner;
public class MatakuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());
        Matakuliah22[] arrayOfMatakuliah = new Matakuliah22[jumlahMatkul];
        
        // Mengisi data Matakuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah22 ();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        // Menampilkan data matakuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
           arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
