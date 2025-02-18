public class DosenMain22 {
    public static void main(String[] args) {
        int masaKerja;
        Dosen22 d1 = new Dosen22();
        
        d1.idDosen = "SCP";
        d1.nama = "Sucipto";
        d1.bidangKeahlian = "Bhs. Inggris";
        d1.tahunBergabung = 2010;
        
        d1.setStatusAktif(false);
        d1.tampilInformasi();
        masaKerja = d1.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja);
        d1.ubahKeahlian("DASPRO");
        d1.tampilInformasi();
        System.out.println("Masa kerja" + masaKerja);
    }

}
