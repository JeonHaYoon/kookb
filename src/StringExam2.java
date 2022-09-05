import java.util.Iterator;

public class StringExam2 {

	public static void main(String[] args) {
		String s1="Hello H World        ";
		System.out.println("[DEG]["+s1+"]");
		//공백제거
		System.out.println("[공백제거]["+s1.trim()+"]");
		//지정된 위치의 문자 출력
		System.out.println("[지정된 위치의 문자 출력]["+s1.substring(1,6)+"]");
		System.out.println("[DEG]["+s1.substring(6)+"]");
		//글자 대체
		System.out.println("[글자 대체]["+s1.replace("World","JAVA")+"]");
		//글자 처음 시작하는 곳이 어디인지 
		System.out.println("[글자 처음 시작]["+s1.indexOf("H")+"]");
		//2번째 H가 나오는 곳
		System.out.println("[2번째 H]["+s1.lastIndexOf("H")+"]");
		//index[2]에 해당하는 문자를 가져온다. indexOf와 반대
		System.out.println("[index[2]에 해당]["+s1.charAt(2)+"]");
		//처음 시작이 해당하는 글자로 시작하는지 맞으면 true
		System.out.println("[시작하는지 맞으면]"+s1.startsWith("Hel"));
		//글자 길이
		System.out.println("[글자 길이]"+s1.length());
		//s1 글자 뒤에 "" 문자를 추가하겠다.
		System.out.println("[문자를 추가]"+s1.concat("s"));
		int ii=1;
		System.out.println("[DEG]"+(s1+String.valueOf(ii)));
		System.out.println("[DEG]"+(String.format("%03d", ii)));

		String cars = "hyundai,mercedes,bmw";
		String[] carSplit = cars.split(",");   //,를 기준으로 분리
		String up= cars.toUpperCase();    //대문자로 변경
		System.out.println(up);  
		
		for (int i = 0; i < carSplit.length; i++) {
			System.out.println(carSplit[i]);
		}
	}

}
