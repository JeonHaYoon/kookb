import java.util.Arrays;

/**
 * 
 * @author BigData18
 *
 */

public class ArrayExam8 {

	public static void main(String[] args) {

	
//		5칸의 배열을 생성하고 3,4,2,1,5의 값을 입력후
//		1,2,3,4,5로 출력되게 하세요.
		
		int[] arr= {32,4,2,10,5};
		
		//코딩시작
		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//						
//			for(int j=0; j<arr.length;j++) {
//								
//				if( arr[i]<arr[j]) {
//					int tmp=arr[0];
//					tmp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}
//			
//		}
		
	
		//코딩끝
		
		//아래는 수정하지마세요. 출력부분입니다.
		//배열의 값을 하나씩 가져와서 data 출력
		for(int data : arr) {
			System.out.print(data+" ");
		}
	}

	
}
