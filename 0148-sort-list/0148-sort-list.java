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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findMid(head);
        ListNode leftHead=head;
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode sortLeft=sortList(leftHead);
        ListNode sortRight=sortList(rightHead);
        return Merge(sortLeft,sortRight);
    }
    private ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode Merge(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(0); //a dummy node to track the head of our new sorted list
        ListNode curr=temp;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
                curr=curr.next;
            }else{
                curr.next=l2;
                l2=l2.next;
                curr=curr.next;
            }
        }
        if(l1!=null){
            curr.next=l1;
        }else{
            curr.next=l2;
        }
        return temp.next; //because temp was just our placeholder dummy node
    }
}