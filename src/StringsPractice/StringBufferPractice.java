package StringsPractice;

public class StringBufferPractice {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hi ");
		
		System.out.println("Initial capacity : " + sb.capacity());
		
		sb.append("Welcome to String learning Class");
		
		sb.insert(3, "Divya ");

		System.out.println("Insert Operation : " + sb);

		System.out.println("capacity addition : " + sb.capacity());

		sb.replace(3, 9, "Prabu ");

		System.out.println("Replace operation : " + sb);

		System.out.println(sb.length());

		sb.delete(36, 41);

		System.out.println("Delete Operation : " + sb);

		sb.reverse();

		System.out.println("reverse Operation : " + sb);

		sb.reverse();

		System.out.println("reverse Operation : " + sb);
	}

}
