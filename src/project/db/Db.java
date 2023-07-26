package project.db;

import project.entity.Student;

import java.util.*;

public class Db {
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        //输入：nums = [1,2,11,7,15], target = 9
        int[] nums=new int[]{1,2,11,7,15};
        Db d = new Db();
        int[] ints = d.twoSum(nums, 26);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> kToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            boolean containsKey = kToIndex.containsKey(nums[i]);
            if (containsKey) {
                Integer index = kToIndex.get(nums[i]);//1
                int[] result = new int[]{index, i};
                return result;
            } else {
                int k = target - nums[i];
                kToIndex.put(k, i);
            }
        }
        return null;
    }
}

