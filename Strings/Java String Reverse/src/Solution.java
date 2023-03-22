import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr = A.toCharArray();
        String reverse = "";
        for(int i = A.length() - 1; i >= 0; i--)
            reverse += arr[i];
        String result = A.equals(reverse) ? "Yes" : "No";
        System.out.println(result);
    }
}