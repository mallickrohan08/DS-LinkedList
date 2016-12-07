class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class DeleteNodeInLL {
	static Node head = null;
	
	public void printList() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is empty.");
		}
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//Delete key at some particular index.
	public void deleteAtIndex(int index) {
		Node temp = head;
		Node prev_node = null;
		int tempIndex = 0;
		
		if(temp == null) {
			System.out.println("List is Empty.");
		}
		//If index is 0 then Dele
		if(index == 0) {
			Node firstNode = head;
			head = firstNode.next;
			return;
		}
		while(temp != null && tempIndex < index ) {
			tempIndex++;
			prev_node = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Index is more than List Size.");
			return;
		}
		Node targetNode = prev_node.next;
		temp = prev_node;
		temp.next = targetNode.next;
	}
	
	//This method will delete all key in the List
	public void deleteAllKey(int data) {
		
	}
	
	public static void main(String args[]) {
		DeleteNodeInLL obj = new DeleteNodeInLL();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		System.out.println("=================");
		System.out.println(head);
		System.out.println(n1.next);
		System.out.println(n2.next);
		System.out.println(n3.next);
		System.out.println("=================");
		obj.printList();
		System.out.println("=================");
		obj.deleteAtIndex(2);
		obj.printList();
		
	}
}