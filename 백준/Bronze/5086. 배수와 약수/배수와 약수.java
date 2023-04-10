import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        boolean f,m;
        while(true){
            f = m = false;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0&&b==0)
                break;
            if(b%a==0)
                f = true;
            if(a%b==0)
                m = true;
            if(f)
                System.out.println("factor");
            else if(m)
                System.out.println("multiple");
            else
                System.out.println("neither");
        }
    }
}
