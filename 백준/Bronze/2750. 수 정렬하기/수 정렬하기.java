import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for(int f1=0;f1<n;f1++){
            nums[f1] = sc.nextInt();
        }
        for(int f1=0;f1<n-1;f1++){
            for(int f2=f1;f2<n;f2++) {
                int dump;
                if (nums[f1] > nums[f2]) {
                    dump = nums[f1];
                    nums[f1] = nums[f2];
                    nums[f2] = dump;
                }
            }
        }
        for(int f1=0;f1<n;f1++){
            System.out.println(nums[f1]);
        }
    }
}
