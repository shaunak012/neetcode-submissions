/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val>list2.val) return mergeTwoLists(list2,list1);

        ListNode ans=list1;

        ListNode next1=list1.next;
        ListNode next2=list2.next;

        while(list1!=null && list2!=null){
            if(list1.val==list2.val){
                list1.next=list2;
                list1=list2;
                list1.next=next1;
                list2=next2;
                next2=list2==null?null:list2.next;
            }
            else if(list1.val<list2.val){
                if(next1==null){
                    list1.next=list2;
                    break;
                }else if(next1.val<list2.val){
                    list1=next1;
                    next1=list1.next;
                }else{
                    list1.next=list2;
                    list1=list2;
                    list1.next=next1;
                    list2=next2;
                    next2=list2==null?null:list2.next;
                }
            }
        }
        return ans;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=null;
        for(int i=0;i<lists.length;i++){
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }
}
