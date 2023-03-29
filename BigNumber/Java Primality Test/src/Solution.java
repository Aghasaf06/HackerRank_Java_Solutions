import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger N = new BigInteger(n);
        System.out.println(N.isProbablePrime(1) ? "prime" : "not prime");
        bufferedReader.close();
    }
}