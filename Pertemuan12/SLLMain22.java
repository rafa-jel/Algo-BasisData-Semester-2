public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();

        Mahasiswa22 mhs1 = new Mahasiswa22("001", "Ayu", "TI-1A", 3.8);
        Mahasiswa22 mhs2 = new Mahasiswa22("002", "Budi", "TI-1A", 3.5);
        Mahasiswa22 mhs3 = new Mahasiswa22("003", "Cici", "TI-1B", 3.9);
        Mahasiswa22 mhs4 = new Mahasiswa22("004", "Dian", "TI-1B", 3.7);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("dian", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
