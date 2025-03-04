import java.util.Scanner;
public class Kafe22 {
    public int jmlKopi;
    public int jmlTeh;
    public int jmlSusu;

    public Kafe22 (int jmlKopi,int jmlTeh, int jmlSusu) {
        this.jmlKopi = jmlKopi;
        this.jmlTeh = jmlTeh;
        this.jmlSusu = jmlSusu;
    }

    public Kafe22() {

    }

    public void pembelian (Scanner sc) {
        System.out.print("Jumlah Kopi       : ");
        this.jmlKopi = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Teh        : ");
        this.jmlTeh = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Susu       : ");
        this.jmlSusu = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------");
    }

    public void cetakPembelian() {
        System.out.println("Jumlah Kopi yang Dibeli    : " + this.jmlKopi);
        System.out.println("Jumlah Teh yang Dibeli     : " + this.jmlTeh);
        System.out.println("Jumlah Susu yang Dibeli    : " + this.jmlSusu);
        System.out.println("------------------------------------");
        System.out.println("Total Item   = " + (jmlKopi + jmlSusu + jmlTeh));
        System.out.println("Harga Kopi = 5000");
        System.out.println("Harga Teh  = 4000");
        System.out.println("Harga Susu = 3000");
        int hargaKopi = 5000 * jmlKopi;
        int hargaTeh = 4000 * jmlTeh;
        int hargaSusu = 3000 * jmlSusu;
        System.out.println("Total Harga              : " + (hargaKopi + hargaTeh + hargaSusu));
        System.out.println("------------------------------------");
    }
}