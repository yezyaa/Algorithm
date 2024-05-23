import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int first = num1 * (num2 % 10);

        num2 /= 10;
        int second = num1 * (num2 % 10);

        num2 /= 10;
        int third = num1 * (num2 % 10);

        int sum = first + (second * 10) + (third * 100);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(sum);
    }
}