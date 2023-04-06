import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int max = Integer.MIN_VALUE;
        int maxind = 0;
        for(int i=0;i<9;i++)
            nums[i] = sc.nextInt();
        for(int i=0;i<9;i++){
            if(max<nums[i]){
                max = nums[i];
                maxind = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxind);
    }
}
