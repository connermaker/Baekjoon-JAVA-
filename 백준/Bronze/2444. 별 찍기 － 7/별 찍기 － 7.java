import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=1;i<=n*2-1;i++){
            if(i<=n) {
                for (int j = 0; j < n - i; j++)
                    System.out.print(" ");
                for(int j=0;j<i*2-1;j++)
                    System.out.print("*");
            }
            else {
                for (int j = i; j > n; j--)
                    System.out.print(" ");
                for(int j=0;j<(n-(i-n))*2-1;j++)
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
