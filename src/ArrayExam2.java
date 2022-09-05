/**
 * 
 * 배열
 * 이름.국어.영어,코드 배열 만들기
 * @author BigData18
 *
 */
public class ArrayExam2 {

	public static void main(String[] args) {
		System.out.println("이름\t국어\t영어\t코딩");
		
		int studentUnit=10;
		String[] names = new String[studentUnit];
		int[] kors = new int[studentUnit];
		int[] engs = new int[studentUnit];
		int[] codes= new int[studentUnit];
		
		names[0]="홍길동";
		kors[0]=100;
		engs[0]=90;
		codes[0]=90;
		
		names[1]="이순신";
		kors[1]=90;
		engs[1]=70;
		codes[1]=80;
		
		for(int i=0;i<names.length;i++) {
			//이름이 null값이면 반복문을 벗어나라
			if(names[i]==null) {
				break;
			}
		System.out.printf("%s\t%d\t%d\t%d\n",names[i],kors[i],engs[i],codes[i]);
		}

	}

}
