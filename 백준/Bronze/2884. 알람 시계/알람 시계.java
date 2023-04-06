import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m;
        h = sc.nextInt();
        m = sc.nextInt();
        if((m-45)>=0)
            m -= 45;
        else {
            if(h!=0)
                h -= 1;
            else
                h = 23;
            m += 15;
        }
        System.out.printf("%d %d\n",h,m);
    }
}
