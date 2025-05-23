package LinkedList;

public class DoublylinkedList {
	public static void main(String[] args) {

		LinkedNode n1 = new LinkedNode(10);
		LinkedNode n2 = new LinkedNode(20);
		LinkedNode n3 = new LinkedNode(30);
		LinkedNode n4 = new LinkedNode(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		LinkedNode curr = n4;

		n4.prev = n3;
		n3.prev = n2;
		n2.prev = n1;

		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.prev;
		}
	}

}
