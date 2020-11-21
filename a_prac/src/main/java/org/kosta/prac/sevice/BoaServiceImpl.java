package org.kosta.prac.sevice;

import java.util.List;

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
	@Override
	public List<PostVO> getList() {
		List<PostVO> list = boardMapper.getList();
		return list;
	}
	@Override
	public PostVO getPost() {
		PostVO pvo = boardMapper.getPost();
		return null;
	}
	
}
