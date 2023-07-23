package xxxx.xx;


import six.Animal;

import java.time.LocalDateTime;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();// 1 ,2,3,4
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.set(0, 100);
        System.out.println(list.toString());


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println(set.toString());

        Queue<Integer> queue = new ArrayDeque<>();



        Map<String, Integer> map = new HashMap<>();
        map.put("sam", 10);
        map.put("bob", 11);
        map.put("lily", 13);
        map.put("dive", 15);
        System.out.println(map.get("bob"));

        for (Integer i : list) {
            Integer value = i;
        }

        for (Map.Entry<String, Integer> i : map.entrySet()) {
            String key = i.getKey();
            Integer value = i.getValue();
            System.out.println("key="+key+"; "+"value = "+value);
        }








    }


    public int[] plusOne(int[] arr) {
//n是 result 的长度，暂时设置为0 你需要自己去修改 n 的长度
//提示，从后往前循环数组，准备一个变量 int carry = 0，用来代表进位，
//如果加1后，进位为1，继续循环；如果进位为0那么结束。
//自己拿[9,9]思考一下
        int n = arr.length;
        int[] result = new int[n];
        int carry=0;
        for(int i=n-1;i>=0;i--) {
            if(arr[i]==9) {
                carry=1;
                arr[i]=0;
                continue;
            }
            else {
                result[i]=arr[i];
            };
        }
        if(carry==1) {
            result=new int[n+1];
            result[0] = 1;
            return result;
        }
        else {
            result[n - 1] += 1;
        }
        return result;
    }


    //9,9,9,9
//    public int[] plusOne(int[] arr) {
//        int n = arr.length;
//        int[] result = new int[n];
//        int carry = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            if (i == n - 1 || carry == 1) {
//                int temp = arr[i] + 1;
//              carry = temp / 10;
//              result[i] = temp % 10;
//            }else {
//                result[i] = arr[i];
//            }
//        }
//        if (carry == 1) {
//            int[] result2 = new int[n + 1];
//            result2[0] = 1;
//            return result2;
//        }
//        return result;
//    }
}


