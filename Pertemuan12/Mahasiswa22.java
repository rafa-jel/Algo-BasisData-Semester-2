public class Mahasiswa22 {
    String nim; 
    String nama; 
    String kelas;
    double ipk;
    
    public Mahasiswa22(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}