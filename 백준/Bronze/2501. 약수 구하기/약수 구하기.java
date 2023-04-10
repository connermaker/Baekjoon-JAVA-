import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,count = 0;
        int res = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
            if(count==k) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
