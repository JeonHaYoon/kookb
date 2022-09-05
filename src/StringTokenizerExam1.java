import java.util.StringTokenizer;

public class StringTokenizerExam1 {

	public static void main(String[] args) {

		String cars = "KIA,BMW!BNEZ";

		StringTokenizer st = new StringTokenizer(cars, ",!");
		while(st.hasMoreElements()) {
			String car=st.nextToken();
			System.out.println(car);
		}
		while(st.hasMoreElements()) {
			String car=st.nextToken();
			System.out.println(car);
		}
		System.out.println("=========================");
		
		
		String[] carArr = cars.split("!");
		for (int i = 0; i < carArr.length; i++) {
			System.out.println(carArr[i]);
		}
	}

}
