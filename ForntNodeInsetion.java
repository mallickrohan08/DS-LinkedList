class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class ForntNodeInsetion {
	Node head = null;
	
	public void addInFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void printList() {
		Node n = head;
		if(n == null) {
			System.out.println("List is Empty \n");
		}
		else {
			while(n != null) {
				System.out.println(n.data + "\n");
				n = n.next;
			}
		}
	}
	
	public static void main(String args[]) {
		ForntNodeInsetion fin = new ForntNodeInsetion();
		fin.printList();
		fin.addInFront(10);
		fin.addInFront(20);
		fin.addInFront(30);
		fin.addInFront(40);
		fin.printList();
	}
}