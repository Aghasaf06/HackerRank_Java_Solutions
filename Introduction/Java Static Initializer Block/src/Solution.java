import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int B = scan.nextInt();
        int H = scan.nextInt();

        try{
            if(B <= 0 || H <= 0){
                throw new Exception("Breadth and height must be positive");
            }
            int area = B * H;
            System.out.println(area);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}