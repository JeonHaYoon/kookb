import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExam1 {

	public static void main(String[] args) {
//      test.txt를 가져와서 읽어오겠다 
//		->try-catch 만들어라
//		->파일을 못찾을 수 있다는 예외발생할 수 있다
//		getLocalizedMessage() 을 넣으면 에러문만 따로 출력된다.
		
		
		File file= new File("test.txt");
		
		try {
			Scanner scan= new Scanner(file);
			System.out.println("예외상황시 실행");
	
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
