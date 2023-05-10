import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] nums = new int[n];
        for(int f1=0;f1<n;f1++){
            nums[f1] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[n-k]);
    }
}
