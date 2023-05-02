import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int[3];
        int maxlen = 0;
        int maxlenind = 0;
        int dump = 0;
        for(int f1=0;f1<3;f1++){
            line[f1] = sc.nextInt();
            if(maxlen<line[f1]) {
                maxlen = line[f1];
                maxlenind = f1;
            }
        }
        for(int f1=0;f1<3;f1++){
            if(f1!=maxlenind)
                dump += line[f1];
        }
        while (maxlen>=dump){
            maxlen--;
        }
        System.out.println(maxlen+dump);
    }
}
