import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        long n;
        n = Long.parseLong(st.nextToken());
        int b,set = 0;
        b = Integer.parseInt(st.nextToken());
        for(int i=0;i<=30;i++)
            if(Math.pow(b,i)>n) {
                set = i;
                break;
            }
        for(int i=set-1;i>0;i--){
            int dump = 0;
            dump = (int) (n / Math.pow(b,i));
            n = (long) (n % Math.pow(b,i));
            if(10>dump)
                sb.append((char)(dump+'0'));
            else
                sb.append((char)(dump+'A'-10));
        }
        if(10>n)
            sb.append((char)(n+'0'));
        else
            sb.append((char)(n+'A'-10));
        System.out.println(sb.toString());

    }
}
