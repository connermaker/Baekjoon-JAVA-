import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[9][9];
        int max = -1;
        int x=0,y=0;
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                mat[i][j] = sc.nextInt();

        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++){
                if(mat[i][j]>max) {
                    max = mat[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        System.out.println(max);
        System.out.printf("%d %d\n",x,y);

    }
}
