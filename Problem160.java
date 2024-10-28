public class Problem160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        while(headB != null) {
            ListNode temp = headA;
            while(temp != null){
                if(temp == headB) return headB;
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
