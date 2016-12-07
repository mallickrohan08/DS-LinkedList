class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class InsertAtIndex {
	Node head = null;
	int size = 0;
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void addAtFirst(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
		size++;
	}
	public void addAtIndex(int index, int data) {
		if(index == 0 || head == null) {
			addAtFirst(data);
		}
		int tempIndex = 0;
		Node temp = head;
		while(temp != null) {
			tempIndex++;
			if(index == tempIndex) {
				Node obj = new Node(data);
				obj.next = temp.next;
				temp.next = obj;
				size++;
				break;
			}
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		InsertAtIndex obj = new InsertAtIndex();
		obj.addAtIndex(0, 10);
		obj.printList();
		System.out.println("Size = " + obj.size);
		System.out.println("--------------------------");
		obj.addAtIndex(1, 20);
		obj.addAtIndex(2, 30);
		obj.addAtIndex(3, 40);
		obj.addAtIndex(4, 50);
		obj.printList();
		System.out.println("Size = " + obj.size);
		System.out.println("--------------------------");
		obj.addAtIndex(0, 60);
		obj.addAtIndex(4, 70);
		obj.addAtIndex(1, 80);
		obj.addAtIndex(4, 70);
		obj.printList();
		System.out.println("Size = " + obj.size);
	}
	
}