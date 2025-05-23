package StringsPractice;

public class StringCompression {

	public static void main(String[] args) {
		String s = "aaaabbbccddeeffgghhiijjkkllaa";
		char[] c=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		int i=0;
		int count=0;
		
		while(i<s.length())
		{
			char ch=c[i];
			count=1;
			while(i+1<=s.length()-1 && c[i+1]==ch)
			{
				count++;
				i++;
			}
			
			sb.append(count);
			sb.append(c[i]);
			i++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		char[] c = s.toCharArray();
//		int i = 0;
//		StringBuffer sb = new StringBuffer();
//
//		while (i <= c.length - 1) {
//			int count = 1;
//			while (i + 1 <= c.length - 1) {
//				if (c[i] == c[i + 1])
//					count++;
//				else
//					break;
//				i++;
//			}
//
//			sb.append(count);
//			sb.append(c[i]);
//			// count+c[i];
//
//			i++;
//		}
		System.out.println("result string  " + sb);
	}
}
