
public class StringBuilderExam {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();

		sb.append("A")
		.append("B")
		.append("C");
		String s = sb.toString();
		System.out.println(s);
	}

}
