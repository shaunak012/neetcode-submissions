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
    public int getNum(ListNode l1){
        int n=0,x=1;
        while(l1!=null){
            n=n+l1.val*x;
            x=x*10;
            l1=l1.next;
        }
        return n;
    }
    public ListNode getLL(int n){
        ListNode ans=new ListNode(n%10);
        ListNode temp=ans;
        n=n/10;
        while(n!=0){
            temp.next=new ListNode(n%10);
            n=n/10;
            temp=temp.next;
        }
        return ans;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1=getNum(l1),n2=getNum(l2);
        System.out.print(n1+n2);
        return getLL(n1+n2);
    }
}
