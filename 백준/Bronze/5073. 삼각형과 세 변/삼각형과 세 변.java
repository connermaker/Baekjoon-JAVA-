import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int[3];
        int maxline = 0;
        int maxlineind = 0;
        int dump=0;
        while(true){
            maxline = 0;
            maxlineind = 0;
            dump = 0;
            for(int f2=0;f2<3;f2++) {
                line[f2] = sc.nextInt();
                if(maxline<line[f2]) {
                    maxline = line[f2];
                    maxlineind = f2;
                }
            }
            if(line[0]==line[1]&&line[1]==line[2]){
                if(line[0]==0)
                    break;
                else
                    System.out.println("Equilateral");
            }
            else if (line[0]==0||line[1]==0||line[2]==0)
                System.out.println("Invalid");
            else if (line[0]==line[1]||line[1]==line[2]||line[0]==line[2]){
                for(int f2=0;f2<3;f2++){
                    if(f2!=maxlineind)
                        dump += line[f2];
                }
                if(maxline<dump)
                    System.out.println("Isosceles");
                else
                    System.out.println("Invalid");
            }
            else{
                for(int f2=0;f2<3;f2++){
                    if(f2!=maxlineind)
                        dump += line[f2];
                }
                if(maxline<dump)
                    System.out.println("Scalene");
                else
                    System.out.println("Invalid");
            }
        }
    }
}
