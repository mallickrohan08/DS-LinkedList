class Node {
	int data;
	Node next;
	Node (int d) {
		data = d;
		next = null;
	}
}
class IntorLinkedList {
	
	public static void main(String args[]) {
		Node head = null;
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		
		System.out.println(head);
		System.out.println("--------------------");
		System.out.println(n1);
		System.out.println(n1.data);
		System.out.println(n1.next);
		System.out.println("--------------------");
		System.out.println(n2);
		System.out.println(n2.data);
		System.out.println(n2.next);
		System.out.println("--------------------");
		System.out.println(n3);
		System.out.println(n3.data);
		System.out.println(n3.next);
	}
}