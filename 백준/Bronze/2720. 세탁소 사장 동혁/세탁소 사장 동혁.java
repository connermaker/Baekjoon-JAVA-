import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,c;
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            int q,d,n,p;
            c = sc.nextInt();
            q=c/25;
            c %=25;
            d=c/10;
            c%=10;
            n=c/5;
            c%=5;
            p=c;
            System.out.printf("%d %d %d %d\n",q,d,n,p);
        }
    }
}
