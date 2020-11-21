package org.kosta.prac.sevice;

import java.util.List;

import org.kosta.prac.model.vo.PostVO;

public interface BoaService {
	void register(PostVO postVO);

	List<PostVO> getList();

	PostVO getPost();
}
