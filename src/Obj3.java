
public class Obj3 {

	public static void main(String[] args) {
		// 객체지향프로그래밍

		String figure = "Star";
		switch (figure) {
		case "Square":
			Square square = new Square();
			square.x = 100;
			square.y = 100;
			square.rotation();
			break;
		case "Triangle":
			Triangle triangle = new Triangle();
			triangle.x = 90;
			triangle.y = 90;
			triangle.rotation();
			break;
		case "Star":
			Star star= new Star();
			star.x = 50;
			star.y = 50;
			star.rotation();
			break;
		}

	}

}
