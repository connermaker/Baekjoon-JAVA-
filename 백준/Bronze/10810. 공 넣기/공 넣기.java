import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] buk = new int[n];
        for(int f1=0;f1<m;f1++){
            int i,j,k;
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int f2=i-1;f2<j;f2++){
                buk[f2] = k;
            }
        }
        for(int i=0;i<n;i++)
            System.out.printf("%d ",buk[i]);
    }
}
