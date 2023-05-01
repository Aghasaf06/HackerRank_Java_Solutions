import java.util.*;

class Solution{
    public static void main(String []argh) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        HashMap<String, Integer> PhoneBook = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();

            PhoneBook.put(name, phone);
        }

        while(scan.hasNext()) {
            String s = scan.nextLine();

            if(PhoneBook.containsKey(s)){
                System.out.println(s + "=" + PhoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}