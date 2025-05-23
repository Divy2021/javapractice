package java12features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsFeatures {

	public static void main(String[] args) {

		
		Result collect = Stream.of(1,2,12,13,14,15,16).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(n->Integer.parseInt(n.toString())>10, Collectors.toList()), Result::new));
		
		System.out.println(collect);
	}

}
