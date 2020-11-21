package org.kosta.prac.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.prac.model.vo.PostVO;

@Mapper
public interface BoardMapper {

	void register(PostVO postVO);

}
