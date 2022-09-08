
public class CastingExam1 {

	public static void main(String[] args) {
	
		int num1 = 1, num2= 4;
		double res1 =  num1/num2;
		System.out.println(res1);
		
		double res2 =  (double) num1/num2;
		System.out.println(res2);
		
		double res3 =  num1/(num2*1.); 
		 //.만 찍어도 double로 변형된다
		System.out.println(res3);



	}

}
