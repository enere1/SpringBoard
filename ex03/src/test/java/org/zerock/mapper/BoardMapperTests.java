package org.zerock.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	/*
	 * @Test public void testGetList() {
	 * 
	 * mapper.getList().forEach(board -> log.info(board));
	 * 
	 * }
	 * 
	 * @Test public void testInsert() { BoardVO board = new BoardVO();
	 * board.setTitle("新しい掲載"); board.setContent("新し内容"); board.setWriter("newbie");
	 * 
	 * mapper.insert(board); log.info(board);
	 * 
	 * }
	 * 
	 * @Test public void testRead() { //존재하는 게시물 번호로 테스트 BoardVO board =
	 * mapper.read(5L); log.info(board);
	 * 
	 * }
	 * 
	 * @Test public void testDelete() { log.info("DELETE COUNT : " +
	 * mapper.delete(3L)); }
	 * 
	 * @Test public void testUpdate() {
	 * 
	 * BoardVO board = new BoardVO(); board.setBno(5L); board.setTitle("修正する　タイトル");
	 * board.setContent("修正する　内容"); board.setWriter("user00");
	 * 
	 * int count = mapper.update(board); log.info("UPDAtE COUNT : " + count); }
	 */

@Test
public void testPaging() {
	Criteria cri = new Criteria();
	cri.setPageNum(3);
	cri.setAmount(10);
	List<BoardVO> list = mapper.getListWithPaging(cri);
	list.forEach(board-> log.info(board));
	}
}
