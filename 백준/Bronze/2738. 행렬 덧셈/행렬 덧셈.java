import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] mat1 = new int[n][m];
        for(int f1=0;f1<n;f1++){
            for (int f2=0;f2<m;f2++){
                mat1[f1][f2] = sc.nextInt();
            }
        }
        for(int f1=0;f1<n;f1++){
            for (int f2=0;f2<m;f2++){
                mat1[f1][f2] += sc.nextInt();
            }
        }

        for(int f1=0;f1<n;f1++){
            for (int f2=0;f2<m;f2++){
                System.out.printf("%d ",mat1[f1][f2]);
            }
            System.out.println("");
        }
    }
}
