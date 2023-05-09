import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum=0;
        for(int f1=0;f1<5;f1++){
            nums[f1] = sc.nextInt();
            sum +=nums[f1];
        }
        sum = (int)(sum/5.);
        Arrays.sort(nums);
        System.out.println(sum);
        System.out.println(nums[2]);
    }
}
