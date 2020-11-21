package org.kosta.prac.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.prac.model.vo.MemberVO;

@Mapper
public interface MemberMapper {

	public MemberVO login(MemberVO memberVO);

	public void register(MemberVO memberVO);

}
