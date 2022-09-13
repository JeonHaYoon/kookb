import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(0, "A");
		map.put(1, "B");
		
		//value값만 출력
		Collection<String> list = map.values();
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
