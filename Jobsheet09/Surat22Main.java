import java.util.Scanner;
public class Surat22Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat22 stack = new StackSurat22(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat22 suratBaru = new Surat22(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;

                case 2:
                    Surat22 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " telah diproses.");
                    }
                    break;

                case 3:
                    Surat22 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.search(cariNama);
                    break;

                case 0:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}
