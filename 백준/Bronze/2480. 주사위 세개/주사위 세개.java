import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        int dump = 0;
        boolean[] cond = new boolean[4];
        boolean flag =false;
        int pric = 0;
        for(int i=0;i<3;i++)
            dice[i] = sc.nextInt();
        cond[0] = dice[0]==dice[1];
        cond[1] = dice[1]==dice[2];
        cond[2] = dice[0]==dice[2];
        cond[3] = dice[0]==dice[1] && dice[1]==dice[2] && dice[0]==dice[2];
        if(cond[3]){
            pric += 10000;
            pric += dice[0]*1000;
        }
        else {
            for (int i = 0; i < 3; i++) {
                if (cond[i]) {
                    pric += 1000;
                    pric += dice[i] * 100;
                    flag = true;
                }
                else {
                    if (dump < dice[i])
                        dump = dice[i];
                }
            }
        }
        if(!flag){
            pric += dump*100;
        }
        System.out.println(pric);
    }
}
