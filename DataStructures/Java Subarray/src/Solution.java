import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }

        int f = 1;
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = f; j <= n; j++){
                int sum = 0;
                for(int k = i; k < j; k++){
                    sum += array[k];
                }
                if(sum < 0){
                    answer++;
                }
            }
        }

        System.out.println(answer);

        scan.close();
    }
}