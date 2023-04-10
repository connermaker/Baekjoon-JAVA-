import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n,k;
        int res = 0;
        boolean flag = false;
        while(true) {
            res = 0;
            flag = false;
            n = sc.nextInt();
            if(n==-1)
                break;
            sb.append(n + " = ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    if(flag)
                        sb.append(" + ");
                    res += i;
                    sb.append(i);
                    flag = true;
                }
            }
            if (res == n)
                System.out.println(sb.toString());
            else
                System.out.printf("%d is NOT perfect.\n",n);
            sb.delete(0,sb.length());
        }
    }
}
