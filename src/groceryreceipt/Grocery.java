package groceryreceipt;

public class Grocery {

	String fruit;
	double price;
	double discount;
	double total;
	int count;

	public Grocery(String fruit, double price, double total, double discount, int count) {
		// super();
		this.fruit = fruit;
		this.price = price;
		this.total = total;
		this.discount = discount;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return fruit + " " + price + " " + discount + " " + total;
	}
}
