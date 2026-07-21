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
        int count =0;
        ListNode result=head;

        while(result!=null){
            count++;
            result=result.next;

        }
        if(count==n){
            return head.next;
        }
        result=head;
        for(int i=1; i<count-n; i++){
            result=result.next;
        }
        result.next=result.next.next;
        return head;
    }
}