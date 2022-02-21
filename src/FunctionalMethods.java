import java.util.ArrayList;
import java.util.List;

public class FunctionalMethods {

//Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    public static List<Integer> findRightDigit(List<Integer> nums){
        nums.replaceAll(n -> n % 10);
        return nums;
    }

// Given a list of integers, return a list where each integer is multiplied by 2.
    public static List<Integer> multiplyByTwo(List<Integer> nums){
        nums.replaceAll(n -> n * 2);
        return nums;
    }

// Given a list of strings, return a list where each string has all its "x" removed.
    public static List<String> removeX(List<String> str){
        str.replaceAll(n -> n.replace("x", ""));
        return str;
    }




    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(4);
        List<String> str = new ArrayList<String>(3);
        str.add("ax");
        str.add("bb");
        str.add("xcx");

        // using add() to initialize values
        arr.add(12);
        arr.add(25);
        arr.add(37);
        arr.add(47);
        System.out.println(findRightDigit(arr));
        System.out.println(multiplyByTwo(arr));
        System.out.println(removeX(str));
    }
}
