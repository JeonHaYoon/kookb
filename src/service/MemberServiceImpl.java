package service;

import java.util.List;

import dao.MemberMapper;
import domain.MemberDTO;
import domain.MemberVO;

public class MemberServiceImpl implements MemberService {
	

	@Override
	public void create(MemberDTO dto) {
		MemberMapper mapper=new MemberMapper();
		mapper.create(dto);
		
	}

	@Override
	public List<MemberVO> read() {
		MemberMapper mapper=new MemberMapper();
		List<MemberVO> list= mapper.read();
		return list;
	}

	@Override
	public MemberDTO read(String mb_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberDTO dto) {
		MemberMapper mapper=new MemberMapper();
		mapper.update(dto);		
	}

	@Override
	public void delete(String mb_id) {
		MemberMapper mapper=new MemberMapper();
		mapper.delete(mb_id);
	}

	
	
}
