import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(0, "A");
		map.put(1, "B");
		
		//key값만 출력
		Set<Integer> key = map.keySet();
		Iterator<Integer> it = key.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
