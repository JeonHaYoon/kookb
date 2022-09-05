

/**
 * gun 상속과 오버라이딩
 * @author BigData18
 *
 */
public class GunGame {

	public static void main(String[] args) {
//		AssaultRifle ar = new AssaultRifle("k416");
//		ShotGun sg = new ShotGun("M500");
		
		//다형성 성립
		
		Gun ar = new AssaultRifle("k416");
		ar.fire();
		System.out.println("k416 남은 총알 수 = "+ ar.bulletCount);

		
		Gun sg = new ShotGun("M500");
		sg.fire();
		System.out.println("M500 남은 총알 수 = "+ sg.bulletCount);
		
	}

}
