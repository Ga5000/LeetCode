public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {

                current.next = current.next.next;
            } else {

                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);


        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
