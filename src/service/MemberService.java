package service;

import java.util.List;

import domain.MemberDTO;
import domain.MemberVO;

/**
 * CRUD구현
 * @author BigData18
 *
 */


public interface MemberService {

	//Create
	public void create(MemberDTO dto);

	//Read

	public List<MemberVO> read();   //전체회원목록
	public MemberDTO read(String mb_id);   //회원id에 대한 정보조회
	
	//Update
	public void update(MemberDTO dto);
	
	
	//Delete
	public void delete(String mb_id);
	
	
}
