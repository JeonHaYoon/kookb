/**
 * 두 수의 변수를 선언하고, 사칙연산은 수행하시오.
 * +, -, *, / , %
 */
public class Oper1 {
	public static void main(String[] args) {
		int i =7;
		int j =2;
		
//		i=i+2;     
		i+=2;    //위와 같은 결과가 나온다.
		System.out.println("[DEG]I="+i);
		
		
		//////증감연산자 ++, -- ////////////
		//////전위, 후위연산자 ////////////
//		j=j+1;
//		j+=1;
//		j++;    후위연산자
//		++j;     전위연산자
		System.out.println("[DEG]J="+(++j));
		
		///////////////////////////////////
		
		int res = i + j;		
		System.out.println("[DEG]res="+res);
		
		res = i - j;
		System.out.println("[DEG]res="+res);
		
		res = i * j;
		System.out.println("[DEG]res="+res);
		
		res =  i / j;
		System.out.println("[DEG]res="+res);
		
		double res1= i/j;
		System.out.println("[DEG]res1="+res1);
		
		res =  i % j;
		System.out.println("[DEG]res="+res);
	}

}
