/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Integer> get_index=new HashMap<>();
        HashMap<Integer,Node> get_node=new HashMap<>();
        Node ans=new Node(head.val);
        int count=0;
        get_index.put(head,count);
        get_node.put(count++,ans);
        Node temp=head.next;
        Node temp2=ans;
        while(temp!=null){
            get_index.put(temp,count);
            temp2.next=new Node(temp.val);
            temp2=temp2.next;
            temp=temp.next;
            get_node.put(count++,temp2);
        }
        temp=head;
        temp2=ans;
        while(temp2!=null){
            temp2.random=get_node.get(get_index.get(temp.random));
            temp2=temp2.next;
            temp=temp.next;
        }
        return ans;
    }
}
