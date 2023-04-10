import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().toString());
        StringBuilder sb = new StringBuilder();
        String num1 = new String();
        String num2 = new String();
        String res = new String();
        boolean dif = false;
        int maxl = 0,minl = 0;
        int next = 0;
        boolean is1big = true;
        num1 = st.nextToken();
        num2 = st.nextToken();
        for(int i=num1.length()-1;i>=0;i--)
            sb.append(num1.charAt(i));
        num1 = sb.toString();
        sb.delete(0,sb.length());
        for(int i=num2.length()-1;i>=0;i--)
            sb.append(num2.charAt(i));
        num2 = sb.toString();
        sb.delete(0,sb.length());
        if(num1.length()!=num2.length())
            dif = true;
        if(dif&&num1.length()<num2.length())
            is1big = false;
        if(!is1big) {
            minl = num1.length();
            maxl = num2.length();
        }
        else{
            maxl = num1.length();
            minl = num2.length();
        }
        next = 0;
        for(int i=0;i<minl;i++){
            int dump;
            dump = ((num1.charAt(i)-'0')+(num2.charAt(i)-'0'))+next;
            next = dump / 10;
            dump %=10;
            sb.append((char)(dump+'0'));
        }
        if(dif&&is1big){
            for(int i=minl;i<maxl;i++){
                int dump;
                dump = (num1.charAt(i)-'0')+next;
                next = dump / 10;
                dump %=10;
                sb.append((char)(dump+'0'));
            }
        }
        else if(dif&&!is1big){
            for(int i=minl;i<maxl;i++){
                int dump;
                dump = (num2.charAt(i)-'0')+next;
                next = dump / 10;
                dump %=10;
                sb.append((char)(dump+'0'));
            }
        }
        if(next != 0)
            sb.append((char)(next+'0'));
        res = sb.reverse().toString();
        System.out.println(res);
    }
}
