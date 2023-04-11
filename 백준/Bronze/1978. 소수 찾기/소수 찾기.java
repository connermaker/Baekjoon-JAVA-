import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int che = 0;
        n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        for(int i = 0;i<n;i++){
            che = 0;
            for(int j = 1;j<=nums[i];j++){
                if(nums[i]%j==0)
                    che++;
            }
            if(che==2)
                count++;
        }
        System.out.println(count);
    }
}
