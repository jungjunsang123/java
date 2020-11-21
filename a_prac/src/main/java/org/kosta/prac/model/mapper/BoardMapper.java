package org.kosta.prac.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.prac.model.vo.PostVO;

@Mapper
public interface BoardMapper {

	void register(PostVO postVO);

	List<PostVO> getList();

	PostVO getPost();

}
