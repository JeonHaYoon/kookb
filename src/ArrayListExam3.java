import java.util.ArrayList;
import java.util.List;

public class ArrayListExam3 {

	public static void main(String[] args) {
		//다형성
		List<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			
		}

	}

}
