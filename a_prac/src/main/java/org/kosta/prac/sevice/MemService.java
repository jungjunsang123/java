package org.kosta.prac.sevice;

import org.kosta.prac.model.vo.MemberVO;

public interface MemService {
	MemberVO login(MemberVO memberVO);

	void register(MemberVO memberVO);
}
