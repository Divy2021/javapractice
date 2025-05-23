package stream;

public class product {

	int price;
	String name;

	public product(int price, String name) {
		// super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "product [price=" + price + ", name=" + name + "]";
	}
	
	

}
