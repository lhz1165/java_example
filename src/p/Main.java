package p;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = main.twoSum(nums, target);
        System.out.println(Arrays.toString(result));



    }

    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 [和]为目标值 target  的那 [两个] 整数，并返回它们的数组[下标]。
    //nums = [2,7,11,15], target = 9
    // 输出 [0,1]  因为 nums[0] + nums[1] == 9 ，返回 [0, 1]

    //nums = [3,2,4], target = 6
    //[1,2]
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        return result;
    }
}
