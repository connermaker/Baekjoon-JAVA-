import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j;
        int dump;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] buk = new int[n];
        for(int f1=0;f1<n;f1++)
            buk[f1] = f1+1;
        for(int f1=0;f1<m;f1++){
            dump = 0;
            i = sc.nextInt();
            j = sc.nextInt();
            for(int f2=0;f2<Math.ceil((j-i)/2.0);f2++){
                dump = buk[i+f2-1];
                buk[i+f2-1] = buk[j-f2-1];
                buk[j-f2-1] = dump;
            }
        }
        for(int f1=0;f1<n;f1++)
            System.out.printf("%d ",buk[f1]);
    }
}
