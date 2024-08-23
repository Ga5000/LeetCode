package MergeTwoSortedListsProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> list = new ArrayList<>();
        while(list1 != null){
            list.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        for(int val : list){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        head = head.next;

        return head;
    }
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode res = mergeTwoLists(list1, list2);

        ListNode temp = res;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }



    }
}
