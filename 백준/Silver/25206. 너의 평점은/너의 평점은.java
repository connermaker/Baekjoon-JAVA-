import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t_point = 0;
        double t_grade = 0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String label =new String();
            double point, grade;
            label = st.nextToken();
            point = Double.parseDouble(st.nextToken());
            switch (st.nextToken()){
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "P":
                    grade = -1.0;
                    break;
                default:
                    grade = 0.0;
                    break;
            }
            if(grade<0)
                continue;
            t_point += point;
            t_grade += point*grade;
        }
        t_grade /= t_point;
        System.out.println(t_grade);
    }
}
