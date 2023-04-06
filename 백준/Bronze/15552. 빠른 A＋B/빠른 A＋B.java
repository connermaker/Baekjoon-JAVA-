import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t,a;
        t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            a=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            a += Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(a)+"\n");
        }
        bw.flush();
    }
}
