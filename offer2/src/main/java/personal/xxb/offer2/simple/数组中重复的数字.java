package personal.xxb.offer2.simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 可以使用哈希表实现
 */
public class 数组中重复的数字 {

    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer, Object> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)){
                return i;
            }else {
                map.put(i, null);
            }
        }
        return -1;
    }

    public static int hashSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5};
        System.out.println(findRepeatNumber(a));
    }

}
