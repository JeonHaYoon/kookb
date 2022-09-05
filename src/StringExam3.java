/**
 * "19991231" 문자열을 "1999년 12월 31일"로 출력하세요.
 * 
 * @author BigData18
 *
 */
public class StringExam3 {

	public static void main(String[] args) {
		String str="19991231";
		//시작

		String year= str.substring(0,4);
		String month= str.substring(4,6);
		String day= str.substring(6);
		
		System.out.println(year.concat("년 ")+month.concat("월 ")+day.concat("일"));
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		//끝
	}

}
