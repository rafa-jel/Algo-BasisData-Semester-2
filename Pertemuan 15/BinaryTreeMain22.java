public interface BinaryTreeMain22 {
    public static void main(String[] args) {
        BinaryTree22 bst = new BinaryTree22();

        bst.add(new Mahasiswa22("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa22("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa22("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa22("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa :");
        System.out.print("Cari mahasiswa dengan ipk : 3.54");
        String hasilCari = bst.find(3.54)?" Ditemukan":" Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk : 3.22");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa22("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa22("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa22("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa :");
        System.out.println("In order traversal");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre order traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("Post order traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal)");
        bst.traverseInOrder(bst.root);
    }
}
