import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,a;
        t = sc.nextInt();
        for(int i=1;i<=t;i++){
            a = sc.nextInt();
            a += sc.nextInt();
            System.out.printf("Case #%d: %d\n",i,a);
        }
    }
}
