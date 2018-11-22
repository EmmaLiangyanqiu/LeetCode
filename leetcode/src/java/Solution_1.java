import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Emma
 * @Description: 两数相加
 * @Date: 2018/11/22 10:22
 **/

public class Solution_1 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        int param = 5;

        Arrays.stream(twoSum(arr, param)).forEach(System.out::println);


    }

    public static int[] twoSum(int[] arr,int target){

        Map<Integer,Integer> map = new HashMap<>();

        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i){

                res[0] = i;

                res[1] = map.get(target - arr[i]);

                break;
            }

            map.put(arr[i],i);
        }

        return res;
    }
}
