class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
class SizeOfLLRecursiveWay {
	static Node head = null;
	
	public int getCount() {
		int size = 0;
		Node temp = head;
		if(temp == null) {
			System.out.println("List is Empty");
			return size;
		}
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public static void main(String args[]) {
		SizeOfLLRecursiveWay obj = new SizeOfLLRecursiveWay();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		System.out.println("Size : " + obj.getCount());
	}
	
	
}