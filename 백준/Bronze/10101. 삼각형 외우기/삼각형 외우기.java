import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angle = new int[3];
        int sumang = 0;
        for(int f1=0;f1<3;f1++) {
            angle[f1] = sc.nextInt();
            sumang += angle[f1];
        }
        if(sumang!=180)
            System.out.println("Error");
        else if (angle[0]==angle[1]&&angle[1]==angle[2])
            System.out.println("Equilateral");
        else if (angle[0]==angle[1]||angle[1]==angle[2]||angle[0]==angle[2])
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
