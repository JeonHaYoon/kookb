/**
 * 도형 클래스
 * 
 * figure- 부모
 *|  |  |
 *T  S  S   <- 삼각, 사각, 별 자식. 상속받고 있으
 * @author BigData18
 *
 */
public class Figure {

	int x;
	int y;
	
	public void rotation() {
		System.out.println(this.getClass().getName()+"의 중심점("+x+","+y+")	으로 회전합니다.");
	}
}
