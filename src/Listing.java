public class Listing {

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode we = new ListNode(2);
//        ListNode fe = new ListNode(2);
//        ListNode se = new ListNode(1);
//        fe.next=se;
//        we.next=fe;
//        head.next=we;
        Listing listing = new Listing();
        //listing.isPalindrome(head);

        ListNode head1 = new ListNode(1);
        ListNode we1 = new ListNode(4);
        ListNode fe1 = new ListNode(8);
        ListNode se1 = new ListNode(3);
        ListNode te = new ListNode(6);
        we1.next=fe1;
        head1.next=we1;

        se1.next=te;
        ListNode result = listing.merge(head1,se1);
        System.out.println(result);
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)slow = slow.next;
        ListNode previous= reverseList(slow);
        Boolean inside = true;
        while(head.next!=null && previous.next!=null){
            inside = false;
            if(head.val!=previous.val)
                return false;
            head= head.next;
            previous= previous.next;
        }
        if(inside){
            return head.val==previous.val;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current!= null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

    public void insertLast(ListNode head, int value){
        ListNode last = new ListNode(value);
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=last;
    }

    public boolean containsLoop(ListNode head){
        ListNode fast = head;
        ListNode slow =  head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;

        }
        if(a==null){
            tail.next=b;
        }else{
            tail.next=a;
        }
        return dummy.next;
    }
}
