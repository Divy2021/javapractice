package java8features;

import java.util.Optional;

public class OptionalsDemo {

	public static void main(String[] args) {

		Optional<String> empty = Optional.empty();
		System.out.println("is empty :" + empty.isEmpty());
		System.out.println("ispresent :" + empty.isPresent());
		empty = Optional.of("new java 8");
		Optional<String> data = Optional.of("Optional Java 8 feature");
		System.out.println("is present :" + data.isPresent());
		System.out.println("value of data :" + data.get());
		// filter method
		System.out.println(data.filter((x) -> x.contains("nn")));
		System.out.println(" orelse method :" + empty.orElse("orelse"));
	}
}
