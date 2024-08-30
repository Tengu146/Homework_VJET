import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        System.out.println("Các số lẻ chia hết cho 3 nhỏ hơn " + N + " là:");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}