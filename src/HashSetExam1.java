import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");  //중복된 값은 허용하지 않는다.
		System.out.println(set.size());
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String str=it.next();
		System.out.println(str);
		}
	}

}
