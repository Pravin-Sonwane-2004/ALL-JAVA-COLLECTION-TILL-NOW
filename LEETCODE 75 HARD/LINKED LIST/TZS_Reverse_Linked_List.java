public class TZS_Reverse_Linked_List {
    class list {
        int val;
        list next;
        list (int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static list reverse (list head) {
        if(head==null || head.next == null) {
            return head;
        }
        list newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }
    public static void printList (list head){
            list curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
    }

    public static void main(String[] args) {
        TZS_Reverse_Linked_List r = new TZS_Reverse_Linked_List(); 
        list n1 = r.new list(1);
        list n2 = r.new list(2);
        list n3 = r.new list(3);
        list n4 = r.new list(4);
        list n5 = r.new list(5);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    
        list headlist = reverse(n1); 

        System.out.println("\nReversed List:");
        printList(headlist);
        

    }
    
}
