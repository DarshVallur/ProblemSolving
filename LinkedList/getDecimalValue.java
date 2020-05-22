//Topic: Linked List
//Level: Easy

//Covert Binary Number in a Linked List to Integer

public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val };
	ListNode(int val, ListNode next) { this.val = val, this.next = next }
}

public class result {
	public int getDecimalValue(ListNode head) {
		String data = "";
		
		while(head != null) {
			data += Integer.toString(head.val);
			head = head.next;
		}
		return Integer.parseInt(data, 2);
	}
} 
