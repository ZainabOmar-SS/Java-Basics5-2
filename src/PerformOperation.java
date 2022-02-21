import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int num);
}

class MyMethods {
    public static boolean checker(PerformOperation p, int num){
        return p.check(num);
    }

    public static PerformOperation isOdd(){
        return (num) -> (num % 2 == 0)? false: true;
    }

    public static PerformOperation isPrime(){
        return (num) -> {
            if(num == 1) return true;
            else
            {
                for (int i =  2; i < Math.sqrt(num); i++)
                    if(num % i == 0) return false;
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome(){
        return num -> {
            int sum = 0;
            int reminder, temp = 0;
            while(num > 0){
                reminder = num % 10;
                sum = (sum * 10) + reminder;
                num = num/10;
            }
            if(temp == sum){
                return false;
            }else return true;
        };
    }

}

