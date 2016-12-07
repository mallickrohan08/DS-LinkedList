class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class InserAtLastInLinkedList {
	static Node head = null;
	int size = 0;
	public void printList() {
		Node temp  = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void addNodeAtLast( int data) {
		//Create a new Node
		Node obj = new Node(data);
		//If List is empty;
		if(head == null) {
			head = obj;
		}
		else {
			//Traverse upto last Node
			Node temp = head;
			Node prev_Node = null;
			while(temp != null) {
				prev_Node = temp;
				temp = temp.next;
			}
			prev_Node.next = obj;
		}
		
	}
	
	public static void main(String args[]) {
		InserAtLastInLinkedList obj = new InserAtLastInLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		obj.addNodeAtLast(4);
		obj.printList();
		obj.addNodeAtLast(5);
		obj.printList();
	}
}