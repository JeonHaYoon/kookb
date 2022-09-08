/**
 * MethodExam5에서 메서드를 실행시켜보자
 * 
 */

package util;
public class Util {
	/**
	 * 2단~9단까지의 구구단을 출력한다.
	 */
	public void getGugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println(" " + i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	/**
	 * 값을 정렬합니다.
	 */

	public void sort() {
		int[] arr = { 3, 4, 2, 1, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[0];
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}

	/**
	 * 값을 정렬합니다. 변수 입력해서 정렬
	 */

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[0];
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}

	/**
	 * 학점출력
	 */

	public void mySungjuk(int myJumsu) {
		if (myJumsu >= 90)
			System.out.println("A");
		else if (myJumsu >= 80)
			System.out.println("B");
		else if (myJumsu >= 70)
			System.out.println("C");
		else if (myJumsu >= 60)
			System.out.println("D");
		else
			System.out.println("F");

	}

}
