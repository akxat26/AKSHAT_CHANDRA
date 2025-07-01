import java.util.Scanner;

public class Problem2 {
    public static void printOddSeries(int count) {
        if (count <= 0) return;
        for (int i = 0, num = 1; i < count; i++, num += 2)
            System.out.print(num + (i < count - 1 ? ", " : ""));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        printOddSeries(count);
        sc.close();
    }
}
