package groceryreceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {

		Map<String, Double> prices = new HashMap<String, Double>();
		Map<String, Double> discounts = new HashMap<String, Double>();
		List<Node> nodes = new ArrayList<Node>();
		Scanner priceIn = new Scanner(System.in);
		System.out.println("Enter Fruit and Price : ");

		while (priceIn.hasNextLine()) {
			String fruit = priceIn.next();
			if (fruit == null || "end".equals(fruit)) {
				break;
			}
			prices.put(fruit, priceIn.nextDouble());
		}
		System.out.println("Enter Fruit and Discount : ");
		while (priceIn.hasNextLine()) {
			String fruit = priceIn.next();
			if (fruit == null || "end".equals(fruit)) {
				break;
			}
			discounts.put(fruit, priceIn.nextDouble());
		}
		System.out.println("Enter Fruit and Count : ");
		while (priceIn.hasNextLine()) {
			String fruit = priceIn.next();
			if (fruit == null || "end".equals(fruit)) {
				break;
			}
			nodes.add(new Node(fruit, priceIn.nextInt()));
		}
		priceIn.close();

		GroceryInterfaceImpl groceryInterfaceImpl = new GroceryInterfaceImpl(prices, discounts);
		List<Grocery> groceries = groceryInterfaceImpl.calculateBill(nodes);
		System.out.println("Fruit \t Price \t Count \t Discount \t Total");
		for (Grocery grocery : groceries) {
			System.out.println(grocery.getFruit() + " \t " + grocery.getPrice() + " \t " + grocery.getCount() + " \t "
					+ grocery.getDiscount() + " \t\t " + grocery.getTotal());
		}
	}
}
