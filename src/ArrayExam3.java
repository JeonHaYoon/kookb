/**
 * 
 * 배열
 * 이름.국어.영어,코드 배열 만들기
 * @author BigData18
 *
 */
public class ArrayExam3 {

	public static void main(String[] args) {
		System.out.println("이름\t국어\t영어\t코딩");
		
//		int studentUnit=10;
		
		
		//선언과 동시에 배열값초기화
		String[] names = {"홍길동","이순신"};
		int[] kors = {100,90};
		int[] engs = {90,70};
		int[] codes= {90,80};
		
		for(int i=0;i<names.length;i++) {
			//이름이 null값이면 반복문을 벗어나라
			if(names[i]==null) {
				break;
			}
		System.out.printf("%s\t%d\t%d\t%d\n",names[i],kors[i],engs[i],codes[i]);
		}

	}

}
