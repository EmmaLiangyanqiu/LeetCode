import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Emma
 * @Description: Longest Substring Without Repeating Characters 最长无重复字符的子串
 * @Date: 2018/11/22 10:01
 *
 * */

public class Solution_3 {

    public void method1(String str){

        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ele = str.charAt(i);
            if (map.containsKey(ele)){
                break;
            }
            map.put(ele,1);
        }

    }
}
