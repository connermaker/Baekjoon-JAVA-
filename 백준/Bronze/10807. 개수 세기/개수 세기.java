import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,v,count = 0;
        n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        v = sc.nextInt();
        for(int i=0;i<n;i++)
            if(v==num[i])
                count++;
        System.out.println(count);
    }
}
