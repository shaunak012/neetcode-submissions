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
    public ListNode revList(ListNode head) {
        if(head==null) return head;
        ListNode next=head.next;
        ListNode prev=null;
        while(next!=null){
            head.next=prev;
            prev=head;
            head=next;
            next=head.next;
        }
        head.next=prev;
        return head;
    }
    public void reorderList(ListNode head) {
        ListNode ans=head;
        ListNode rev=head;
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        int count=len/2+len%2;
        for(int i=1;i<count;i++){
            rev=rev.next;
        }
        ListNode temp=rev;
        rev=rev.next;
        temp.next=null;
        rev=revList(rev);

        ListNode next1=ans==null?null:ans.next;
        ListNode next2=rev==null?null:rev.next;
        boolean flag=true;
        while(ans!=null&&rev!=null){
            if(flag){
                ans.next=rev;
                ans=next1;
                next1=ans==null?null:ans.next;
            }else{
                rev.next=ans;
                rev=next2;
                next2=rev==null?null:rev.next;
            }
            flag=!flag;
        }
    }
}
