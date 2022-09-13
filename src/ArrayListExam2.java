import java.util.ArrayList;

public class ArrayListExam2 {

	public static void main(String[] args) {
		
		//제네릭이용
		ArrayList<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			
		}

	}

}
