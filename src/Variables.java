public class Variables {
    //멤버 변수,속성 같은말이니 헷갈리지 말것.
	//인스턴스 변수와 클래스 변수로만 나뉠뿐
	
    int num1;//인스턴스 변수

    // 멤버 변수, 클래스 변수
    static int num2;//클래스 변수

    // 매개변수
    public void printName(String name) {
        // 지역변수
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);
    }

    public static void main(String[] args) {
        // 인스턴스 생성
        Variables mc = new Variables();
        Variables mc2 = new Variables();//생성자
        // 인스턴스 변수 사용
        mc.num1 = 100;
        // 클래스 변수 사용
        mc2.num2 = 200;  // num2 = 50 으로 사용해도 됨.


        System.out.printf("[DEG]%d,%d",mc.num1, mc2.num2);
    }
}