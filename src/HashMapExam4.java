import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "A");
		map.put(1, "B");
		map.put(2, "B");

		Set<Integer> key = map.keySet();
		Iterator<Integer> it = key.iterator();
		while (it.hasNext()) {
			// key에 대한 value값 출력, map.get()으로 불러옴
			System.out.println(map.get(it.next()));
		}
	}

}
