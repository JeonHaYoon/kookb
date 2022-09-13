/**
 * 성적프로그램
 */
public class Obj6 {

	public static void main(String[] args) {
		Record rec = new Record("홍길동", 100, 70, 80);
		Record rec2 = new Record("이순신", 60, 40, 50);

		System.out.println(rec.toString());
		System.out.println(rec2.toString());

		String str= methodExam2("홍길동");
		System.out.println(str);
	}


	private static String methodExam2(String str) {
		return str+"님";
		
	}

}



//
//private static void methodExam(Car car) {
//	// TODO Auto-generated method stub
//	System.out.println(car.model);
//}

//private static void methodExam() {
//
//System.out.println("메서드호출됨");
//}

//private static void methodExam(String str) {
//	System.out.println("메서드호출됨"+str);
//}

//private static void methodExam(String str, int i) {
//	System.out.println("메서드호출됨"+str+i);
//	
//}

//private static int methodExam2() {
//// TODO Auto-generated method stub
//return 111;
//}