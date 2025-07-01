import java.util.*;

public class Problem4 {
    public static Map<Integer, Integer> countMultiples(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) map.put(i, 0);
        for (int num : arr)
            for (int i = 1; i <= 9; i++)
                if (num % i == 0) map.put(i, map.get(i) + 1);
        return map;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Map<Integer, Integer> result = countMultiples(arr);
        System.out.println(result);
        sc.close();
    }
}
