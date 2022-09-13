import java.util.HashMap;
import java.util.Map;

public class HashMapExam1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(0, "A");
		map.put(1, "B");
		
		System.out.println(map.get(0));
	}

}
