import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        java.util.Arrays.sort(ac);
        java.util.Arrays.sort(bc);
        String na = new String(ac);
        String nb = new String(bc);
        boolean result = na.equals(nb) ? true : false;
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
