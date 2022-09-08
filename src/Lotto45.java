
public class Lotto45 {

	public static void main(String[] args) {

//		double num = Math.random();   // 0.0<=num <1.0
//		double num = Math.random()*45;   // 0.0<=num <45.0
//		double num = (Math.random()*45)+1 ;  //1.0<=num<46.0
		for (int j = 0; j < 5; j++) {

			String row="";
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45) + 1;
				row +=num+",";
					
			}
			//시작, 끝에 ,없애기
//			row = 	row.substring(0, row.lastIndexOf(","));
			row= row.substring(0,row.length()-1);
			//끝
			System.out.printf("%s",row);	
			System.out.println();
		}
	}
}
