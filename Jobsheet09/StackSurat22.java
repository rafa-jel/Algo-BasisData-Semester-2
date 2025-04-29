public class StackSurat22 {
    Surat22[] stack;
    int top;

    public StackSurat22(int size) {
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Surat22 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang bisa dilihat.");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].idSurat + " " + stack[i].namaMahasiswa + " " + stack[i].kelas);
            }
        }
    }

    public void search(String nama) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: " + stack[i].idSurat + " - " + stack[i].namaMahasiswa);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
