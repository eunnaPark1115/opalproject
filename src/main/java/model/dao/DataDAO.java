package model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.BoardVO;

@Repository
public class DataDAO {
	@Autowired
	SqlSession session = null;
	//0309 jung �쟾泥� 由ъ뒪�듃 異쒕젰
	public List<BoardVO> listAll() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		String statement = "resource.BoardMapper.select";
		list = session.selectList(statement);																																						
		return list;
	}
	//0309 jung �뜲�씠�꽣 �엯�젰
	public boolean insert(BoardVO vo) {
		System.out.println(" date: " + vo.getWritedate());
		boolean result = false;
		String statement = "resource.BoardMapper.insert";
		if (session.insert(statement, vo) == 1)
			result = true;
		return result;
	}
	// 0309 jung  �뜲�씠�꽣 寃��깋
	public List<BoardVO> search(String keyword, String searchType) {
		List<BoardVO> list =  new ArrayList<BoardVO>();
		String statement = "resource.BoardMapper.search";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		list = session.selectList(statement, map);
		return list;
	}
	// 0309 jung �옉�꽦�옄濡� 寃��깋 
	public List<BoardVO> listWriter(String writer) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		String statement = "resource.BoardMapper.selectWriter";
		list = session.selectList(statement, writer);
		return list;
	}
	// 0309 jung �뜲�씠�꽣 �궘�젣
	public boolean delete(int id) {
		boolean result = false;
		String statement = "resource.BoardMapper.delete";
		if (session.delete(statement, id) == 1)
			result = true;
		return result;
	}
	// 0309 jung �뜲�씠�꽣 �뾽�뜲�씠�듃
	public boolean update(BoardVO vo) {
		boolean result = false;
		String statement = "resource.BoardMapper.update";
		System.out.println("dao�쓽id"+vo.getBoard_id());
		if (session.update(statement, vo) == 1)
			result = true;
		System.out.println("DAO result媛�"+result);
		return result;
	}
	// 0309 jung  �븳媛쒕쭔 異쒕젰
	public BoardVO listOne(int board_id) {
		BoardVO vo = null;
		String statement = "resource.BoardMapper.read";
		vo = session.selectOne(statement, board_id);
		System.out.println(vo);
		
		 String statement2 = "resource.BoardMapper.Cntup";		 
		 session.selectOne(statement2, board_id);
		 

		return vo;
	}

}
