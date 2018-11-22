import java.util.Scanner;

/**
 * @author ：Emma
 * @date ：2018/11/6 9:17
 * @description：Add 倒序链表Two Numbers 两个数字相加   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)   Output: 7 -> 0 -> 8
 * @modified：
 * @version: V1.0
 */

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

}
public class Solution_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arr1 = input.nextLine().split(" ");

        String[] arr2 = input.nextLine().split(" ");

        ListNode listNode1 = init(arr1);

        ListNode listNode2 = init(arr2);

        ListNode result = addTwo(listNode1,listNode2);

        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode init(String[] arr){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 0; i < arr.length; i++) {

            int val = Integer.parseInt(arr[i]);

            ListNode listNode = new ListNode(val);

            curr.next = listNode;

            curr = curr.next;

        }

        return head.next;
    }
    public static ListNode addTwo(ListNode l1,ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 !=null){
            int d1 = l1 == null? 0:l1.val;
            int d2 = l2 == null? 0:l2.val;

            int sum = d1 + d2 + carry;
            carry = sum >= 10? 1:0;

            curr.next = new ListNode(sum%10);
            l1 = l1.next;

            l2 = l2.next;

            curr = curr.next;

        }
        if (carry == 1) curr.next = new ListNode(1);
        return dummy.next;
    }
}
