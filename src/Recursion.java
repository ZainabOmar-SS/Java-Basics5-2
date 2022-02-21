public class Recursion {
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        int i = start;
        int sum = 0;

        while(i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }

        if(groupSumClump(i, nums, target - sum))
            return true;

        if(groupSumClump(i, nums, target))
            return true;

        return false;
    }

    public static void main(String[] args) {
        int start = 0;
        int target = 10;
        int [] arr = new int []{2, 4, 8};

        System.out.println(groupSumClump(start, arr, target));

    }

}
