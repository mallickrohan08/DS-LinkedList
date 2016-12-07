class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
	}
}
class SizeOfLLRecursiveWay {
	static Node head = null;
	
	public int getCount(Node node) {
		if(node == null) {
			return 0;
		}
		return 1 + getCount(node.next);
	}
	
	public static void main(String args[]) {
		SizeOfLLRecursiveWay obj = new SizeOfLLRecursiveWay();
		System.out.println(obj.getCount(head));
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		System.out.println(obj.getCount(head));
	}
}