/**
 * 전투게임에 사용되는 무기 아이템을 상속관계로 구현하고
 * 오버라이딩을 통해 각각의 무기별 특성 구현
 * AssaultRifle
 * ShotGun
 * 
 * @author BigData18
 *
 */
public class Gun {
	
	String model;     //model name of gun
	int bulletCount;  //total count of bullet
	
	public Gun(String model) {
		super();
		this.model = model;
		this.bulletCount=10; 
	}
	
	public void fire() {
		System.out.println("발사");
		this.bulletCount -=1; 
	}
	
	

}
