import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(num[i]>max)
                max=num[i];
            if(num[i]<min)
                min=num[i];
        }
        System.out.printf("%d %d\n",min,max);
    }
}
