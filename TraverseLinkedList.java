/**
*@author : Rohan Mallick
* Basic example to Demonstrate how to traverse a ArrayList.
*/
class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class TraverseLinkedList {
	static Node head = null;
	public void printList() {
		if(head == null) {
			System.out.println("List Is Empty.");
		}
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + "\n");
			temp =  temp.next; 
		}
	}
	public static void main(String args[]) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		head = n1;
		n1.next = n2;
		n2.next = n3;
		TraverseLinkedList tll = new TraverseLinkedList();
		tll.printList();
	}
}