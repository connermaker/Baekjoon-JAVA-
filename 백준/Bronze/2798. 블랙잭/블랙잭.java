import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,max=0;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] nums = new int[n];
        for(int f1=0;f1<n;f1++){
            nums[f1] = sc.nextInt();
        }
        Arrays.sort(nums);
        for(int f1=0;f1<n-2;f1++){
            for(int f2=f1+1;f2<n-1;f2++){
                for(int f3=f2+1;f3<n;f3++){
                    int dump = nums[f1]+nums[f2]+nums[f3];
                    if(dump>max&&dump<=m)
                        max=dump;
                }
            }
        }
        System.out.println(max);
    }
}
