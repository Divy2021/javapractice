package groceryreceipt;

public class Node {

	private String fruit;
	private int count;

	public Node(String fruit, int count) {
		this.fruit = fruit;
		this.count = count;
	}

	public String getFruit() {
		return fruit;
	}

	public int getCount() {
		return count;
	}

}
