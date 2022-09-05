/**
 * Gun상속
 * @author BigData18
 *
 */
public class AssaultRifle extends Gun {

	public AssaultRifle(String model) {
		super(model);    		 //super는 부모클래스
		this.bulletCount=40;    //this는 자신
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fire() {
		System.out.println("=>=>=>=>=> "  );
		this.bulletCount -=5; 
	}
}
