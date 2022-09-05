/**
 * 
 * 배열
 * 이름.국어.영어,코드 배열 만들기
 * @author BigData18
 * 2차원 배열 이용
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		System.out.println("이름\t국어\t영어\t코딩");
		
//		int studentUnit=10;
		
		
		//선언과 동시에 배열값초기화
		String[] names = {"홍길동","이순신"};
		int [][] scores = new int[2][3];  //2는 학생수, 3은 성적
		
		
		//홍길동의 점수 , 국어 영어 코딩
		scores[0][0]=100;
		scores[0][1]=90;
		scores[0][2]=90;
		
		//이순신의 점수, 국어 영어 코딩
		scores[1][0]=90;
		scores[1][1]=70;
		scores[1][2]=80;
		
		System.out.printf("%s\t%d\t%d\t%d\n", names[0],scores[0][0],scores[0][1],scores[0][2] );
		System.out.printf("%s\t%d\t%d\t%d\n", names[1],scores[1][0],scores[1][1],scores[1][2] );
	}
}
