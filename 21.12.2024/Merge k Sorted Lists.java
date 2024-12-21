
class Solution{
    public ListNode mergeKLists(ListNode[] lists){
        int k=lists.length;

        if(k==0){
            return null;
        }

        return partitionAndMerge(0, k-1, lists);
    }

    private ListNode partitionAndMerge(int start, int end, ListNode[] lists){
        if(start==end){
            return lists[start];
        }

        if(start>end){
            return null;
        }
        int mid=start + (end - start)/2;
        ListNode L1=partitionAndMerge(start, mid, lists);
        ListNode L2=partitionAndMerge(mid +1, end, lists);

        return mergeTwoSortedList(L1 ,L2);
    }

    private ListNode mergeTwoSortedList(ListNode L1, ListNode L2){
        if(L1==null) return L2;
        if(L2==null) return L1;

        if(L1.val <= L2.val){
            L1.next=mergeTwoSortedList(L1.next, L2);
            return L1;
        }else{
            L2.next=mergeTwoSortedList(L1, L2.next);
            return L2;
        }
    }
}
