import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int b;
        long total = 0;
        String num = new String();
        num = st.nextToken();
        b = Integer.parseInt(st.nextToken());
        for(int i=0;i<num.length();i++){
            int dump = 0;
            dump = (int)Math.pow(b,num.length()-i-1);
            total += dump*Character.getNumericValue(num.charAt(i));
        }
        System.out.println(total);
    }
}
