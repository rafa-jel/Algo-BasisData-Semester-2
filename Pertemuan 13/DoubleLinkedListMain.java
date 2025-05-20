public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        System.out.println("Data awal pada linked list : " + dll.getFirst());
        System.out.println("Data akhir pada linked list : " + dll.getLast());
        System.out.println("Data indeks ke - 1 pada linked list : " + dll.get(1));
    }
}
