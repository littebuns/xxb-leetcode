package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxb
 * @create 2021/12/1 15:16
 * @desc 杨辉三角
 **/
public class LeetCode118 {

    //personal
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else {
                List<Integer> lastList = result.get(i - 1);
                list.add(1);
                for (int j = 0; j < lastList.size() - 1; j++) {
                    list.add(lastList.get(j) + lastList.get(j + 1));
                }
                list.add(1);
            }
            result.add(list);
        }
        return result;
    }

    /**
     * 使用 ++i 可以提升性能
     * 每个数字等于上一行的左右两个数字之和，可用此性质写出整个杨辉三角。即第 nn 行的第 ii 个数等于第 n-1n−1 行的第 i-1i−1 个数和第 ii 个数之和。
     */
    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j-1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }



    public static void main(String[] args) {
        List<List<Integer>> lists = generate1(5);
        System.out.println(lists.toString());
    }

}
