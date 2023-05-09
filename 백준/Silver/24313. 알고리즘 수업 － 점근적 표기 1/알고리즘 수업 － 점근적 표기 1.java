import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f10,f1;
        int c;
        int n;
        f10 = sc.nextInt();
        f1 = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        int result;
        if(((f10*n+f1)<=(c*n))&&(c>=f10))
            result = 1;
        else
            result = 0;
        System.out.println(result);
    }
}
