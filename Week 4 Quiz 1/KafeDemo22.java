import java.util.Scanner;
public class KafeDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Pembelian: ");
        int jumlahPembelian = Integer.parseInt(sc.nextLine());
        Kafe22[] arrayOfKafe22 = new Kafe22[jumlahPembelian];

        for (int i = 0; i < jumlahPembelian; i++) {
            System.out.println("Masukan data pembelian ke - " + (i+1));
            arrayOfKafe22[i] = new Kafe22 ();
            arrayOfKafe22[i].pembelian(sc);
        }

        for (int i = 0; i < jumlahPembelian; i++) {
            System.out.println("Data Pembelian ke - " + (i+1));
            arrayOfKafe22[i].cetakPembelian();
        }
    }
}
