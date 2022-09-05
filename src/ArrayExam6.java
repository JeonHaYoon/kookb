/**
 * 
 * 배열
 * 이름.국어.영어,코드 배열 만들기
 * @author BigData18
 * 2차원 배열 이용- 반복문
 * 점수를 배열로 간단히 입력하기
 *
 */
public class ArrayExam6 {

	public static void main(String[] args) {
		System.out.println("이름\t국어\t영어\t코딩");
		
			
		//선언과 동시에 배열값초기화
		String[] names = {"홍길동","이순신"};
		int[][] scores = {{100,90,90}      //홍길동의 점수 , 국어 영어 코딩
						  ,{90,70,80}	  //이순신의 점수, 국어 영어 코딩
						  };	  
		
		
//		for문을 이용해서 출력하기
		
		
//		System.out.println(scores.length);     행의 수
//		System.out.println(scores[0].length);  열의 수

		for(int i=0;i<scores.length;i++) {
			System.out.printf("%s\t",names[i]);    
			
			for(int j=0;j<scores[0].length;j++) {
				System.out.printf("%d\t", scores[i][j]);
			}
			System.out.println();    //줄바꿈용
		}
	}
}
