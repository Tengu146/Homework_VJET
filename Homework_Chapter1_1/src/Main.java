import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        System.out.println("Các số chẵn chia hết cho 5 nhỏ hơn " + N + " là:");
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}