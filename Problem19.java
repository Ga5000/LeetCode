
public class Problem19 {
    public static  ListNode removeNthFromEnd(ListNode head, int n){
            if (head == null) return null;
            if(n == 1 && head.next == null) return null;
            ListNode temp = head;
            int count = 1;
            while(temp.next != null){
                count++;
                temp = temp.next;
            }
            if(count == n){
               return head.next;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy;
            ListNode slow = dummy;
            for (int i = 0; i <= n; i++) {
                if(fast.next != null){
                    fast = fast.next;
                }
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;



        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        removeNthFromEnd(head, 2);
        printList(head);
    }
}
