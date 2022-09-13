import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam4 {

	public static void main(String[] args) {
		//이터레이터 사용, hasNext()
		
		List<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		System.out.println("======================");
		
		//이터레이터 사용 후에 또 사용하면 없다. 또 쓰려면 객체를 또 생성하고 사용해야한다.
//		it=list.iterator();     객체 생성 안하면 결과x
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
