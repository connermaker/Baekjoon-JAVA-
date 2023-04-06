import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        int i;
        s = sc.nextLine();
        i = sc.nextInt();
        System.out.println(s.charAt(i-1));
    }
}
