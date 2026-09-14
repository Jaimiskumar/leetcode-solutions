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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int[] arr1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr1[i] = list.get(i);
        }
        int[] arr2 = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            arr2[j] = list.get(list.size()-1-j);
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        else{
            return false;
        }
    }
}

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head==null || head.next==null){
//             return true;
//         }
//         ListNode fast=head;
//         ListNode slow=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
        
//     }
// }