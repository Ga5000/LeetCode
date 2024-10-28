public class Problem61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null) return head;
        for(int i = 0; i <= k; i++){
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
            temp = temp.next;
            head = head.next;
            temp.next = null;
        }
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
        head.next.next = new ListNode(3);
        rotateRight(head, 2);
        printList(head);
    }
}
