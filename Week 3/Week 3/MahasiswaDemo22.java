import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa22[] arrayOfMahasiswa22 = new Mahasiswa22[3];
        String dummy;

        for (int i = 0; i < 3; i++){
            arrayOfMahasiswa22[i] = new Mahasiswa22();

            System.out.println("Masukan data mahasiswa ke - " + (i + 1));
            System.out.print("NIM : "); arrayOfMahasiswa22[i].nim = sc.nextLine();
            System.out.print("Nama : "); arrayOfMahasiswa22[i].nama = sc.nextLine();
            System.out.print("Kelas : "); arrayOfMahasiswa22[i].kelas = sc.nextLine();
            System.out.print("IPK : "); dummy = sc.nextLine();
            arrayOfMahasiswa22[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------------");

        
        }
        for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke - "+ (i + 1) );
        arrayOfMahasiswa22[i].cetakInfo();
        }

        Mahasiswa22[] myArrayOfMahasiswa22 = new Mahasiswa22[3];
        myArrayOfMahasiswa22[0].nim = "24410020091";
        myArrayOfMahasiswa22[0].nama = "RAFAZL RADANA";
        myArrayOfMahasiswa22[0].kelas = "TI-1A";
        myArrayOfMahasiswa22[0].ipk = (float) 3.50;
   }    
}