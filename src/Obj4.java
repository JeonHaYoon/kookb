
public class Obj4 {

	public static void main(String[] args) {
		// 절차적프로그래밍
		// square 사각형, triangle 삼각형, star 별
		String figure = "Star"; // 도형
		rotation(figure); // 함수호출

	}

	private static void rotation(String figure) {
		int x = 0;
		int y = 0;

		switch (figure) {
		case "Square":
			x = 100;
			y = 100;
			System.out.println(figure + "의 중심점(" + x + "," + y + ")	으로 회전합니다.");
			break;
		case "Triangle":
			x = 90;
			y = 90;
			System.out.println(figure + "의 중심점(" + x + "," + y + ")	으로 회전합니다.");
			break;
		case "Star":
			x = 50;
			y = 50;
			System.out.println(figure + "의 중심점(" + x + "," + y + ")	으로 회전합니다.");
			break;
		}
	}

}
