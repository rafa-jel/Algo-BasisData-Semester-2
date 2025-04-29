public class StackKonversi22 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi22() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1; 
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == size -1; 
    }
    public void push(int data) {
        if (isfull()) {
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
    
}