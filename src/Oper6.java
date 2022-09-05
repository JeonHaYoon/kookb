/**
 * 
 * 엘리베이터
 * 550kg, 8인
 * 
 * @author BigData18
 *
 */
public class Oper6 {

	public static void main(String[] args) {
		int weight=400;
		int personnel = 10;
		
		//조건 최대 550kg이상, 또는 8인이이상이면 만원입니다. 내리세요

		if( weight >=550 || personnel>=8) {
			System.out.println("만원입니다 내리세요");
		
		}
	}

}
