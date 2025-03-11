public class KampusMain {
    public static void main(String[] args) {
        Kampus[] mahasiswaList = {
            new Kampus("Ahmad", "220101001", 2022, 78, 82),
            new Kampus("Budi", "220101002", 2022, 85, 88),
            new Kampus("Cindy", "220101003", 2021, 90, 87),
            new Kampus("Dian", "220101004", 2021, 76, 79),
            new Kampus("Eko", "220101005", 2023, 92, 95),
            new Kampus("Fajar", "220101006", 2020, 88, 85),
            new Kampus("Gina", "220101007", 2023, 80, 83),
            new Kampus("Hadi", "220101008", 2020, 82, 84)
        };
        
        int nilaiUTSTertinggi = mahasiswaList[0].nilaiUTS;
        int nilaiUTSTerendah = mahasiswaList[0].nilaiUTS;
        int totalNilaiUAS = 0;

        int left = 0, right = mahasiswaList.length - 1;
        while (left <= right) {
            // Memeriksa nilai UTS tertinggi
            nilaiUTSTertinggi = Math.max(nilaiUTSTertinggi, mahasiswaList[left].nilaiUTS);
            nilaiUTSTertinggi = Math.max(nilaiUTSTertinggi, mahasiswaList[right].nilaiUTS);

            // Memeriksa nilai UTS terendah
            nilaiUTSTerendah = Math.min(nilaiUTSTerendah, mahasiswaList[left].nilaiUTS);
            nilaiUTSTerendah = Math.min(nilaiUTSTerendah, mahasiswaList[right].nilaiUTS);

            // Menghitung total nilai UAS
            totalNilaiUAS += mahasiswaList[left].nilaiUAS;
            if (left != right) { // Hindari perhitungan ganda jika jumlah elemen ganjil
                totalNilaiUAS += mahasiswaList[right].nilaiUAS;
            }

            left++;
            right--;
        }

       
        double rataRataUAS = (double) totalNilaiUAS / mahasiswaList.length;

        
        System.out.println("Nilai UTS Tertinggi : " + nilaiUTSTertinggi);
        System.out.println("Nilia UTS Terendah : " + nilaiUTSTerendah);
        System.out.println("Rata-rata Nilai UAS : " + rataRataUAS);
    }
}
