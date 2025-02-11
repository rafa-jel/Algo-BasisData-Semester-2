import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== KALKULATOR KUBUS ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang rusuk kubus: ");
                double rusuk = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(rusuk));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(rusuk));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(rusuk));
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 4);

        System.out.println("Terima kasih telah menggunakan program ini!");
        scanner.close();
    }

    public static double hitungVolume(double s) {
        return Math.pow(s, 3);
    }

    public static double hitungLuasPermukaan(double s) {
        return 6 * Math.pow(s, 2);
    }

    public static double hitungKeliling(double s) {
        return 12 * s;
    }
}

