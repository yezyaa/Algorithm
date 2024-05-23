import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(); // 0 <= h <= 23
        int m = scanner.nextInt(); // 0 <= m <= 59

        if (h == 0 && m < 45)
            h += 23;
        else if (m < 45)
            h -= 1;

        if (m >= 45)
            m -= 60;

        System.out.print(h + " ");
        System.out.print(m + 60 - 45);
    }
}
