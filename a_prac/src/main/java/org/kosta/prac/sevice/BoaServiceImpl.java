package org.kosta.prac.sevice;

import javax.annotation.Resource;

import org.kosta.prac.model.mapper.BoardMapper;
import org.kosta.prac.model.vo.PostVO;
import org.springframework.stereotype.Service;
@Service
public class BoaServiceImpl implements BoaService{
	@Resource
	BoardMapper boardMapper;
	@Override
	public void register(PostVO postVO) {
		boardMapper.register(postVO);
	}
	
}
