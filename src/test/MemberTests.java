package test;

import java.util.Iterator;
import java.util.List;

import domain.MemberDTO;
import domain.MemberVO;
import service.MemberServiceImpl;

public class MemberTests {

	public static void main(String[] args) {
//		create();   //회원등록
//		read();  	//회원조회
//		update(); // 회원정보변경
//		delete();
		read();
	}

	private static void delete() {
		//big005
		MemberServiceImpl service = new MemberServiceImpl();
		service.delete("big005");
		
	}

	private static void update() {

		MemberDTO dto = new MemberDTO("big005", "bigdata", "비그침", "aa@ac", "12345", "도로명", "구주소", "...", "010-000-0000",
				"20220902", "F");

		System.out.println(dto);

		MemberServiceImpl service = new MemberServiceImpl();
		service.update(dto);

	}

	private static void read() {

		MemberServiceImpl service = new MemberServiceImpl();
		List<MemberVO> list = service.read();
		
		//이터레이터로 변경해서 출력
		Iterator<MemberVO> it=list.iterator();
		while(it.hasNext()) {
			MemberVO vo= it.next();
			System.out.println(vo);
		}
	}

	private static void create() {
		MemberDTO dto = new MemberDTO("big005", "bigdata", "날에는", "aa@ac", "12345", "도로명", "구주소", "...", "010-000-0000",
				"20220902", "F");

		System.out.println(dto);

		MemberServiceImpl service = new MemberServiceImpl();
		service.create(dto);

	}

}
