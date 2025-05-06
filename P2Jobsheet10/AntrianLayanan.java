public class AntrianLayanan {
    Mahasiswa22[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa22[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public Boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + 1) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear  = -1;
            size = 0;
            System.out.println("Queue berhasil di clear");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa22 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah antrian");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }

    public Mahasiswa22 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa22 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }
}
