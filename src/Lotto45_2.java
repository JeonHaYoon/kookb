import java.util.HashSet;
import java.util.Iterator;

public class Lotto45_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			HashSet<Integer> lotto = new HashSet<>();

			for (; lotto.size() < 6;) {
				lotto.add((int) (Math.random() * 45) + 1);
			}

			Iterator<Integer> it = lotto.iterator();

			while (it.hasNext()) {
				System.out.printf("%s,", it.next());
			}
			System.out.println();

		}
	}
}

// 내부 for문을 while문으로 변경해도 가능
//while(true){
//lotto.add(int)(Math.random()*45+1));
//if(lotto.size()==6) {
//	break;
//}
//}
// 

