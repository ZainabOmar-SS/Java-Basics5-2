import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Lambda {
    public static void main(String[] args) throws IOException {
        MyMethods newObj = new MyMethods();
        PerformOperation po;
        String answer = null;
        boolean ret = false;

        BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferR.readLine());

        while (T-- > 0) {
            String s = bufferR.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                po = newObj.isOdd();
                ret = newObj.checker(po, num);
                answer = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                po = newObj.isPrime();
                ret = newObj.checker(po, num);
                answer = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                po = newObj.isPalindrome();
                ret = newObj.checker(po, num);
                answer = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(answer);
        }

    }

}
