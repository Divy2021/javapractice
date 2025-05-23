package hashMapPractice;

import java.util.HashSet;
import java.util.Set;

public class PersonHashCodeandEqualsTest {

	public static void main(String[] args) {

		Set<Person> personSet = new HashSet<>();

		Person p = new Person("Divya", 33);
		Person p2 = new Person("Divya", 33);
		personSet.add(p2);
		personSet.add(p);

		System.out.println(" set size" + personSet.size());
		System.out.println(" set equals" + p.equals(p2));
		System.out.println(" hascode p" + p.hashCode());
		System.out.println(" hashcode p2" + p2.hashCode());

	}

}
