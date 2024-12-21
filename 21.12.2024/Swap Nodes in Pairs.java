
class Solution{
    public ListNode swapPairs(ListNode head){
        if(head== null || head.next==null){
            return head ;
        }
        ListNode odd=head ; 
        ListNode even=head.next; 
       while(odd!=null && even != null){
        int temp=odd.val ;
        odd.val=even.val ;
        even.val=temp;
        if(even!=null){
            odd=even.next;
        }
          if(odd!=null){
            even=odd.next;
        }
} 
return head ; 
    }
}
