import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j,k;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] buk = new int[n];
        int[] dump = new int[n];
        for(int f1=0;f1<n;f1++)
            buk[f1]=f1+1;
        for(int f1=0;f1<m;f1++){
            i = sc.nextInt()-1;
            j = sc.nextInt()-1;
            k = sc.nextInt()-1;
            for(int f2=i;f2<k;f2++)
                dump[f2+j-k+1]=buk[f2];
            for(int f2=k;f2<=j;f2++)
                dump[f2-(k-i)]=buk[f2];
            for(int f2=i;f2<=j;f2++)
                buk[f2]=dump[f2];
        }
        for(int f1=0;f1<n;f1++)
            System.out.printf("%d ",buk[f1]);
        System.out.println("");
    }
}
