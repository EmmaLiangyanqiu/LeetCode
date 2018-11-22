import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author:Emma
 * @Description: Longest Substring Without Repeating Characters 最长无重复字符的子串
 * @Date: 2018/11/22 10:01
 *
 * */

public class Solution_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(method2(str));

    }

    /**
     * @Author:  Emma
     * @Description: 暴力遍历，复杂度为O（n^2)
     * @Date:  2018/11/22 11:20
     * @Param:
     * @return:
     */
    public static String method1(String str){

        int maxLength = 0;
        String res ="";

        for (int i = 0; i < str.length(); i++) {
            int index = 0;
            Map<Character,Integer> map = new HashMap<>();
            for (int j = i; j <str.length() ; j++) {
                Character ele = str.charAt(j);
                if (map.containsKey(ele)){
                    break;
                }
                map.put(ele,1);
                index++;
            }

            if (maxLength<index){
                maxLength = index;
                res = str.substring(i,i+maxLength);
            }
        }

        return res;
    }

    /**
     * @Author:  Emma
     * @Description: 只计算出最长无重复的长度是多少没有截取字符串
     * @Date:  2018/11/22 14:55
     * @Param:
     * @return:
     */

    public static String method2(String str){
        int res = 0,left = 0,right = 0;

        HashSet<Character> characters = new HashSet<>();

        while (right<str.length()){

            if (!characters.contains(str.charAt(right))){

                characters.add(str.charAt(right++));

                res = Math.max(res,characters.size());

            }else {

                characters.remove(str.charAt(left++));
            }

        }
        return str.substring(left,left+res);
    }
}
