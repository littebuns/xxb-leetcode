package simple;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author  xxb
 * @create  2021/11/29 16:47
 * @desc
 **/
public class Leetcode647 {

    public static int countSubstrings(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        sum += chars.length;
        ArrayList<Object> list = new ArrayList<>();
        //计算每个字符出现的次数
        for (char aChar : chars) {
            if (list.contains(aChar)){
                continue;
            }
            list.add(aChar);
            int n = 0;
            for (char c : chars) {
                if (c == aChar){
                    n += 1;
                }
            }
            if (n > 1){
                sum += factorial(n);
            }
        }
        return sum;
    }

    public static int factorial(int a){
        int sum = 1;
        for (int i = 1; i < a; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static void main(String[] args) {
        String str = "aaa";
        int i = countSubstrings(str);
        System.out.println(i);
    }


}
