import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String();
        int n,result = 0;
        n = sc.nextInt();
        sc.nextLine();
        a = sc.nextLine();
        for(int i=0;i<n;i++){
            result += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println(result);
    }
}
