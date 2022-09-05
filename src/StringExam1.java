
public class StringExam1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("hello");
		String s4=new String("Hello");
		String s5=s4;
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5==s4);
		System.out.println(s3.equals(s4));
		//대소문자 무시하고 비교
		System.out.println(s3.equalsIgnoreCase(s4)); 
		
		String s6=null;
		String s7="Hello";
		//하나의 값이 null일때는 equals 안에 넣어주면 된다.
		System.out.println(s7.equals(s6));
	
		
	}

}
