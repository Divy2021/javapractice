package LinkedList;

import java.util.HashMap;

public class RemoveDuplicatesUnsortedLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1 = new Node(50);
		Node n2 = new Node(20);
		Node n3 = new Node(50);
		Node n4 = new Node(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		Node head = n1;

		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}

		head = n1;

		RemoveDuplicatesUnsortedLL rr = new RemoveDuplicatesUnsortedLL();
		rr.removeDuplicates(head);

	}

	public void removeDuplicates(Node head) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		Node curr = head; // 50->20->50->40
		hm.put(curr.value, 1);
		while (curr != null && curr.next != null) {
			if (hm.containsKey(curr.next.value) == false) {
				hm.put(curr.next.value, 1);
			} else
				curr.next = curr.next.next;

			curr = curr.next;
		}
		System.out.println();
		System.out.println("--post removing duplicate");
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}

	}
}
