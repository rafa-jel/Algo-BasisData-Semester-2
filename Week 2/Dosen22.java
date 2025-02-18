public class Dosen22 {
    String idDosen, nama, bidangKeahlian, keaktifan;
    int tahunBergabung;
    boolean statusAktif;

    void tampilInformasi(){
        System.out.println("ID dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Tahun bergabung : " + tahunBergabung);
        System.out.println("Status aktif : " + keaktifan);
    }
void setStatusAktif(boolean Status){
        if(statusAktif == true){
            keaktifan = "Aktif";
        }else{
           keaktifan = "Tidak aktif"; 
        }
    }
int hitungMasaKerja(int thnSekarang){
        int hitungMasaKerja = thnSekarang - tahunBergabung;
        return hitungMasaKerja;
    }

void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}