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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans=head;
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        if(len==n) return ans.next;
        head=ans;
        for(int i=1;i<len-n;i++){
            head=head.next;
        }
        head.next=head.next.next;

        return ans;
    }
}
