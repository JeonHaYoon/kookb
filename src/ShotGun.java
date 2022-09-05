/**
 * Gun상속
 * @author BigData18
 *
 */
public class ShotGun extends Gun {

	public ShotGun(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fire() {
		System.out.println("=>"  );
		this.bulletCount -=1; 
	}
}
