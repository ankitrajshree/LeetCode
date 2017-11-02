
/**
 * Definition for singly-linked list.*/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0 , carry =  0 ;
        ListNode out  = null ;
        ListNode temp = null;
        ListNode outShifter = null;
        ListNode l1Traverse = l1;
        ListNode l2Traverse = l2;
        if ( l1Traverse != null && l2Traverse != null ){
            sum = (l1Traverse.val + l2Traverse.val + carry );
            out = new ListNode(sum % 10);
            outShifter = out;
            carry = sum / 10;
            if ( l1Traverse.next == null && l2Traverse.next == null && carry != 0 ){
                outShifter = new ListNode(carry);
                out.next = outShifter;
                outShifter.next = null;
                return out;
            }
        }else if ( l1Traverse == null  ){
            out = new ListNode( l2Traverse.val);
            out.next = null;
            return out;
        }else if ( l2Traverse == null){
            out = new ListNode( l1Traverse.val);
            out.next = null;
            return out;
        }
        while (( l1Traverse.next != null) || ( l2Traverse.next != null )){
            if( ( l1Traverse.next != null) && ( l2Traverse.next != null )){
                l1Traverse = l1Traverse.next;
                l2Traverse = l2Traverse.next;
                sum = (l1Traverse.val + l2Traverse.val + carry)  ;
                temp = new ListNode(sum % 10);
                carry = sum / 10 ;
                outShifter.next = temp;
            }else if ( l1Traverse.next != null){
                l1Traverse = l1Traverse.next;
                sum = l1Traverse.val + carry ;
                temp = new ListNode(sum%10) ;
                carry = sum / 10 ;
                outShifter.next = temp;
            }else{
                l2Traverse = l2Traverse.next;
                sum = l2Traverse.val + carry ;
                temp = new ListNode(sum%10) ;
                carry = sum / 10 ;
                outShifter.next = temp;            
            }
            outShifter = temp;   
        }
        if ( carry != 0 ){
            temp = new ListNode(carry) ;
            outShifter.next = temp;
        }
        return out;    
	}
}
