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
    public ListNode reverseList(ListNode head, ListNode after,int k) {
        if(head==null) return head;
        ListNode next=head.next;
        ListNode prev=after;
        while(next!=after){
            head.next=prev;
            prev=head;
            head=next;
            next=next.next;
        }
        head.next=prev;
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        len=len-len%k;
        ListNode start=head;
        ListNode next=start.next;
        
        ListNode prev=head;
        temp=head;
        while(len--!=0 ){
            // System.out.println(temp.val+","+len);
            next=temp.next;
            if(len%k==0 && start==head){
                head=reverseList(start,next,k);
                temp=start;
                prev=start;
                start=start.next;
            }else if (len%k==0){
                prev.next=reverseList(start,next,k);
                temp=start;
                prev=start;
                start=start.next;
            }
            temp=next;
        }
        return head;
    }
}
