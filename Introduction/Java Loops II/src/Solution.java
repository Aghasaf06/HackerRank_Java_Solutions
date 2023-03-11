import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        int[] arra = new int[t];
        int[] arrb = new int[t];
        int[] arrn = new int[t];

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            arra[i] = a;
            arrb[i] = b;
            arrn[i] = n;
        }
        in.close();

        for(int j = 0; j < t; j++){
            for(int k = 0; k < arrn[j]; k++){
                int s = arra[j];
                for(int f = 0; f <= k; f++){
                    s += Math.pow(2, f) * arrb[j];
                }
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}