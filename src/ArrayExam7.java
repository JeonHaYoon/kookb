/**
 * 
 * 피보나치 수열을 100까지 출력을 배열을 이용해서 나타내주세요
 * 0,1,2,3,5,8,13,21,34,55
 * @author BigData18
 *
 */
public class ArrayExam7 {

	public static void main(String[] args) {	
		//배열 초기화
		
		int[] pibo= {0,1,0,0,0,0,0,0,0,0,0,0};
		
//		pibo[0]=0;
//		pibo[1]=1;
//		pibo[2]=1;   
//		pibo[3]=2;    
//		pibo[4]=3;
//		pibo[5]=5;
//		pibo[6]=8;
//		pibo[7]=13;
//		pibo[8]=21;
//		pibo[9]=34;
//		pibo[10]=55;
//		pibo[11]=89;
		
		//입력처리
		
		for(int i=2; i<pibo.length; i++) {
			pibo[i]=pibo[i-2]+pibo[i-1];
		}
		

		//출력처리
		for(int i=0;i<pibo.length;i++) {
			System.out.print(pibo[i]+" ");
		}
		
	}

}

//		System.out.println(a);
//		System.out.println(b);
//		for(int i=0;i<10;i++) {
//			c=a+b;
//			a=b;
//			b=c;
//			
//			System.out.println(c);
//			}
		


