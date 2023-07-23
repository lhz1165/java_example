package six;


public class MyInteger {
    public static void main(String[] args) {
        String s1 = "456123";

        Integer realInt = Integer.valueOf(s1);//1000

        Integer yourInt = MyInteger.valueOf2(s1);//1000

        System.out.println(realInt.equals(yourInt));

    }

    public static Integer valueOf(String s1) {
        int result = 0;
        double s = Math.pow(10, s1.length() - 1);
        int[] a = new int[s1.length()];
        char[] charArray = s1.toCharArray();//['1','2','3']
        for (int i = 0, j = 0; i < s1.length(); i++, j++) {
            a[j] = Integer.parseInt(String.valueOf(charArray[i]));
            result += a[j] * s;
            s = s / 10;
        }
        return result;
    }

    public static Integer valueOf2(String s1) {
        int n = s1.length();
        int result = 0;
        int s = 1;
        char[] charArray = s1.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            int c = charArray[i]- '0';//  '3' -> 3
            result = result + c * s;
            s = s * 10;
        }
        return result;
    }



}

