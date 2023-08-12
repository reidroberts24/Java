import java.util.ArrayList;
public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	public Node remove() {
		if (head == null) {
			return null;
		}
	    
		if (head.next == null) {
	        Node temp = head;
	        head = null;
	        return head;
	    }
	    
		Node runner = head;
		while (runner.next.next != null) {
			runner = runner.next;
		}
		Node temp = runner.next;
		runner.next = null;
		return temp;
	}
	
	public void printValues() {
		Node runner = head;
		ArrayList<Integer> values = new ArrayList<>();
		while (runner != null) {
			values.add(runner.value);
			runner = runner.next;
		}
		System.out.println(values);
	}
	
}
