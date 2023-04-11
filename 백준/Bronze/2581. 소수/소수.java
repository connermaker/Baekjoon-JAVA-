import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        int che = 0;
        int sum = 0;
        int min = -1;
        m = sc.nextInt();
        n = sc.nextInt();
        for(int i = m;i<=n;i++){
            che = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0)
                    che++;
            }
            if(che==2){
                sum += i;
                if(min == -1)
                    min=i;
            }
        }
        if(min == -1){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
