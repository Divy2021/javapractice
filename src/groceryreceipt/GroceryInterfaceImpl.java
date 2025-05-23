package groceryreceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryInterfaceImpl implements GroceryInterface {

	public Map<String, Double> prices = new HashMap<>();
	public Map<String, Double> discount = new HashMap<>();

	public GroceryInterfaceImpl(Map<String, Double> prices, Map<String, Double> discount) {
		this.prices = prices;
		this.discount = discount;
	}

	@Override
	public List<Grocery> calculateBill(List<Node> shoppingList) {
		List<Grocery> groceries = new ArrayList<Grocery>();
		Grocery grocery = null;
		Map<String, Integer> hm = new HashMap<>();
		for (Node s : shoppingList) {
			int totCount = 0;
			if (hm.containsKey(s.getFruit())) {
				totCount = hm.get(s.getFruit()) + s.getCount();
			} else {
				totCount = s.getCount();
			}
			hm.put(s.getFruit(), totCount);
		}

		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			double price = prices.get(m.getKey());
			double dis = discount.get(m.getKey());
			int totCount = m.getValue();
			double totalPrice = totCount * price;
			grocery = new Grocery(m.getKey(), price, totalPrice - (totalPrice * dis / 100), dis, totCount);
			groceries.add(grocery);
		}
		return groceries;
	}

}
