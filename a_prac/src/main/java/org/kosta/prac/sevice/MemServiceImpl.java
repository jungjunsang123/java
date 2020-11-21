package org.kosta.prac.sevice;

import javax.annotation.Resource;

import org.kosta.prac.model.mapper.MemberMapper;
import org.kosta.prac.model.vo.MemberVO;
import org.springframework.stereotype.Service;
@Service
public class MemServiceImpl implements MemService{
	@Resource
	MemberMapper memberMapper;

	@Override
	public MemberVO login(MemberVO memberVO) {
		return memberMapper.login(memberVO);
	}

	@Override
	public void register(MemberVO memberVO) {
		memberMapper.register(memberVO);
	}

}
