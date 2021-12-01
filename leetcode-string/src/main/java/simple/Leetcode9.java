package simple;
/**
 * @author  xxb
 * @create  2021/11/30 15:33
 * @desc 回文数
 **/
public class Leetcode9 {

    //personal
    public static boolean isPalindrome(int i){
        String str = String.valueOf(i);
        boolean flag = true;
        for (int j = 0; j < str.length()/2 + 1; j++) {
            if (str.charAt(j)!=str.charAt(str.length()-j-1)){
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isPalindrome1(int x){
        return (x + "").equals(new StringBuilder(x + "").reverse().toString());
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }


}
