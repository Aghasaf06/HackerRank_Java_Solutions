import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> List = new ArrayList<>();

        for(int i = 0; i < n; i++){
            List.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for(int i = 0; i < q; i++){
            String query = scan.next();
            if(query.equals("Insert")){
                List.add(scan.nextInt(), scan.nextInt());
            }
            else if(query.equals("Delete")){
                List.remove(scan.nextInt());
            }
        }

        for(Integer i : List){
            System.out.print(i + " ");
        }

        scan.close();
    }
}