package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practiceStream {

	public static void main(String[] args) {
		product[] p = { new product(150, "mixie"), new product(200, "grinder"), new product(1200, "fridge") };

		System.out.println("---------------");
		System.out.println("Products gt 100");
		System.out.println("---------------");

		Arrays.stream(p).filter(x -> x.getPrice() > 100)
				.forEach(x -> System.out.println(x.getName() + " " + x.getPrice()));

		List<product> lp = Arrays.stream(p).filter(x -> x.getPrice() > 150).collect(Collectors.toList());
		List<Integer> prices=Arrays.stream(p).map(x->x.getPrice()).collect(Collectors.toList());
		System.out.println(prices);

		//forEach(x->System.out.println(x));
		System.out.println("---------------");
		System.out.println("Products gt 150");
		System.out.println("---------------");
		for (product x : lp) {
			System.out.println(x.getName() + " " + x.getPrice());
		}
		System.out.println(lp);
	}

}
//Arrays.stream(p).filter(x-> x.getPrice()>100).forEach(x->System.out.println(x.getName()+" "+x.getPrice()));
