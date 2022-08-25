# First sol
---------------
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int countA=0,countB=0,len=0;
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        while (ptrA != null){
            countA++;
            ptrA = ptrA.next;
        }
        while (ptrB != null){
            countB++;
            ptrB = ptrB.next;
        }
        int skip = countB - countA;
        if (skip > 0){
            while (len < skip){
                headB = headB.next;
                len++;
            }
        } else if (skip < 0){
            while (len<Math.abs(skip)){
                headA = headA.next;
                len++;
            }
        }
        while ( headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;        
    }
}
------------------------
# Second sol
------------------------
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA==null && headB==null) return null;
       ListNode h1 = headA;
       ListNode h2 = headB; 
       while(h1 != h2 ){ 
           h1 = h1 == null? headB : h1.next ;             
           h2 = h2 == null? headA : h2.next ;
       }
       return h2; 
    }
}
