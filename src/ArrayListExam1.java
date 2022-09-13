import java.util.ArrayList;

public class ArrayListExam1 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("A");
		list.add("B");
		for(int i=0; i<list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
			
		}

	}

}
