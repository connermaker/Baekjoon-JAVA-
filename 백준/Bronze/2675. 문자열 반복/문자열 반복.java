import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,r;
        String s = new String();
        t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            for(int j=0;j<s.length();j++){
                for(int k=0;k<r;k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
