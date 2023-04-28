import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<List<Integer>> listOfList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();

            int d = scan.nextInt();

            if(d > 0){
                for(int j = 0; j < d; j++)
                    list.add(scan.nextInt());
                listOfList.add(list);
            }
            else
                listOfList.add(list);
        }

        int q = scan.nextInt();

        for(int i = 0; i < q; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            try{
                System.out.println(listOfList.get(x - 1).get(y - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}