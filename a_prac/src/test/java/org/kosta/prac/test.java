package org.kosta.prac;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.prac.model.mapper.MemberMapper;
import org.kosta.prac.model.vo.MemberVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class test {

	@Resource
	MemberMapper mm;
	@Test
	/*
	 * public void myTest() { System.out.println(mm.login(new MemberVO("java",
	 * "1234", null, null))); }
	 */
	public void register(MemberVO memberVO) {
		
	}
}
