import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int k = 0; k < n; k++)
            a[k] = scan.nextInt();
        scan.close();

        for (int j : a) {
            System.out.println(j);
        }
    }
}