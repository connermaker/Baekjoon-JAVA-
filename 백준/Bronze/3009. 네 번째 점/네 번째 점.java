import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[2][2];
        boolean[][] flag = new boolean[2][2];
        int dump;
        for(int f1=0;f1<2;f1++)
            num[f1][0] = sc.nextInt();
        for(int f1=0;f1<2;f1++) {
            dump = sc.nextInt();
            if(!flag[0][0]&&num[0][0]==dump)
                flag[0][0] = true;
            else if(!flag[0][1]&&num[0][1]==dump)
                flag[0][1]=true;
            else
                num[0][1]=dump;
            dump = sc.nextInt();
            if(!flag[1][0]&&num[1][0]==dump)
                flag[1][0] = true;
            else if(!flag[1][1]&&num[1][1]==dump)
                flag[1][1]=true;
            else
                num[1][1]=dump;
        }
        for(int f1=0;f1<2;f1++){
            for(int f2=0;f2<2;f2++){
                if(!flag[f1][f2])
                    System.out.printf("%d",num[f1][f2]);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
