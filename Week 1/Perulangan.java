import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long NIM;

        System.out.println("==============================");
        System.out.print("Masukan NIM : "); NIM = sc.nextLong();

        NIM = NIM % 100;

        if (NIM < 10) {
            NIM += 10;
        }

        for (int i = 1; i <= NIM; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
