
/**
 * 객체지향 프로그래밍언어
 * 
 * @author BigData18
 *
 */
public class Obj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//클래스의 객체생성
		Car car1=null;   //car1의 객체선언
		car1= new Car();  //인스턴스화 한다.
		
		//객체의 속성에 값 설정
		car1.model="BMW";
		car1.color="빨간색";
		car1.power=180;
		
		
		
		//객체의 속성값 출력
		System.out.printf("%s, %s, %d \n", car1.model, car1.color, car1.power);
	
	}

}
