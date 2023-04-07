import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        int a,max = 0;
        while (st.hasMoreTokens()){
            String dump = new String(st.nextToken());
            for(int i=dump.length()-1;i>=0;i--)
                sb.append(dump.charAt(i));
            a = Integer.parseInt(sb.toString());
            if(max<a)
                max=a;
            sb.delete(0,sb.length());
        }
        System.out.println(max);
    }
}
