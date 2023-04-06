import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = new String();
        boolean flag = false;
        input = sc.nextLine();
        String tokenst = new String();
        StringBuilder output = new StringBuilder();
        StringTokenizer st = new StringTokenizer(input," <>",true);
        while(st.hasMoreTokens()){
            tokenst = st.nextToken();
            if(tokenst.equals("<"))
                flag = true;
            if(!flag&&!tokenst.equals(" ")) {
                for (int i = tokenst.length() - 1; i >= 0; i--) {
                    output.append(tokenst.charAt(i));
                }
                System.out.print(output.toString());
            }
            else{
                System.out.print(tokenst);
            }
            output.delete(0,tokenst.length());
            if (tokenst.equals(">"))
                flag = false;

        }
    }
}
