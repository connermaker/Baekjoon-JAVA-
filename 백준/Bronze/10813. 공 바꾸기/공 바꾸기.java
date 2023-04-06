import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,m,i,j;
        Scanner scancon = new Scanner(System.in);
        while(true){
            n = scancon.nextInt();
            m = scancon.nextInt();
            if(n>=1&&n<=100&&m>=1&&m<=100)
                break;
            System.out.println("두숫자모두 1~100 사이값을 입력해주세요");
        }
        int[] basckets = new int[n];
        for(int f1=0;f1<basckets.length;f1++){
            basckets[f1]=f1+1;
        }
        for(int f1=0;f1<m;f1++) {
            while (true) {
                i = scancon.nextInt();
                j = scancon.nextInt();
                if (1 <= i && i <= j && j <= n) {
                    break;
                }
                System.out.println("두숫자모두 1보다 크거나 같고 총바구니의 숫자보다 작거나 같아야하며\n첫번째 숫자보다 두번째 숫자가 크거나 같아야합니다.\n1 <= 숫자1 <= 숫자2 <= 바구니의 총 개수");
            }
            int dump;
            dump = basckets[i-1];
            basckets[i-1] = basckets[j-1];
            basckets[j-1] = dump;
        }
        for (int f2=0;f2<basckets.length;f2++){
            System.out.printf("%d ",basckets[f2]);
        }
    }
}