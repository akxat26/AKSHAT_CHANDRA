import java.util.Scanner;

public class Problem3 {
    public static void printConditionalOddSeries(int count) {
        if (count <= 0) return;
        int validCount = count % 2 == 0 ? count - 1 : count;
        for (int i = 0, num = 1; i < validCount; i++, num += 2)
            System.out.print(num + (i < validCount - 1 ? ", " : ""));
        System.out.println();
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        printConditionalOddSeries(count);
        sc.close();

    }
}
  
  
