import java.util.Scanner;
public class Mahasiswa23 {

        Scanner sc = new Scanner(System.in);
        String nama;
        String kelas;
        String nim;
        Double ipk;

        void tampilkanInformasi() {
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("IPK : " + ipk);
            System.out.println("Kelas : " + kelas);
        }
        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }
        void updateIpk(double ipkBaru) {
            ipk = ipkBaru;
            if (ipk <= 0.0 && ipk > 4.0) {
                System.out.println("IPK tidak valid");
            }
        }
        String nilaiKinerja() {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }
    }
