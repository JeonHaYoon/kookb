import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 비상연락망
 * 
 */

public class HashMapExam5 {

	public static void main(String[] args) {
	
		Map<String, String> map=new HashMap<>();
		map.put("010-1111-1111", "홍길동");
		map.put("010-2222-2222", "이순신");
		map.put("010-2222-3333", "장보고");
		map.put("010-3333-3333", "강감찬");
		
		//key와 value값을 동시에 출력하시오.
		
		Set<String> key=map.keySet();
		Iterator<String> it=key.iterator();
		
		while(it.hasNext()) {
			String str=it.next();
			System.out.printf("%s, %s%n", str, map.get(str));
		
//			System.out.printf("%s, %s", it.next(), map.get(it.next()));
//			System.out.println();

//			System.out.printf("%s\t", str);
		
		}
	}

}

