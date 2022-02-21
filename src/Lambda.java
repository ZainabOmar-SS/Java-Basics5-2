public class Lambda {
    interface Check{
        String check(int a);
    }

    public static Check isOdd() {
        return (a) -> (a % 2 == 0)? "Even": "Odd";
    }

    public static Check isPrime() {
        return (a) -> {
            if(a == 1) return "Prime";
            else
            {
                for (int i =  2; i < Math.sqrt(a); i++)
                    if(a % i == 0) return "Composite";
                return "Prime";
            }
        };

    }

    public static Check isPalindrome(){
        return (a) -> {
            int sum = 0;
            int reminder, temp = 0;
            while(a > 0){
                reminder = a % 10;
                sum = (sum * 10) + reminder;
                a = a/10;
            }
            if(temp == sum){
                return "Palindrome";
            }else return "Not Palindrome";
        };

    }

}
    
