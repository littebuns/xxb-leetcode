package personal.xxb.offer2.simple;

import java.lang.annotation.Target;

/**
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%'。
 *
 * 注意：
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8以及truncate(-2.7335) = -2
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,231−1]。本题中，如果除法结果溢出，则返回 231− 1
 *

 */
public class LeetCode001 {

    public int divide(int a, int b) {


        boolean flag = true;
        if (a > 0 && b < 0){
            flag = false;
        }else if (a < 0 && b > 0){
            flag = false;
        }

        a = Math.abs(a);
        b = Math.abs(b);
        int temp = b;
        int sum = 0;
        while (a >= b){
            b += temp;
            sum ++;
        }
        if (!flag){
            sum = -sum;
        }
        return sum;

    }


    public static void main(String[] args) {
//        LeetCode001 leetCode001 = new LeetCode001();
//        int divide = leetCode001.divide(-2147483648, -1);
//        System.out.println(divide);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }



}
