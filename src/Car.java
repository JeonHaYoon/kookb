/**
 * 
 * 8/31에 한게 mvc의 dto부분
 * @author BigData18
 *
 */
public class Car {

	//속성(멤버변수)
	String color;   //차량색상
	String model;	//모델명
	int power;		//마력
	
	//디폴트생성자
	public Car() {
		System.out.println("디폴트 생성자는 자동으로 만들어진다.");
	}

	public Car(String model, String color, int power) {
		this.model=model;
		this.color=color;
		this.power=power;
	}
}
