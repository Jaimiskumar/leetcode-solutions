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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>(); 
        ListNode temp = head; 
        while(temp!=null){ 
            list.add(temp.val); 
            temp=temp.next; 
        } 
        int[] arr1=new int[list.size()]; 
        for(int i=0;i<list.size();i++){ 
            arr1[i]=list.get(i); 
        } 
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){ 
            arr2[i]=arr1[arr1.length-1-i]; 
        }
        ListNode newHead = new ListNode(arr2[0]);
        ListNode curr = newHead;
        for(int i = 1; i < arr2.length; i++) {
            curr.next = new ListNode(arr2[i]);
            curr = curr.next;
        }
        return newHead;
    }
}