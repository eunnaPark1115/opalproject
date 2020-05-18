package model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.vo.GoodsVO;
import model.vo.SearchVO;

//20200517 Eunha GoodsDAO

@Repository
public class GoodsDAO {

	@Autowired
	SqlSession session = null;

	public boolean insert(GoodsVO vo) {
		boolean flag = false;
		String statement = "resource.GoodsMapper.insertGoods";
		if (session.insert(statement, vo) == 1) {
			flag = true;
		}
		return flag;
	}

	public boolean update(GoodsVO vo) {
		boolean flag = false;
		String statement = "resource.GoodsMapper.updateGoods";
		System.out.println("session : " + session);
		if (session.update(statement, vo) == 1) {
			flag = true;
		}
		return flag;
	}

	public boolean delete(int post_id) {
		boolean flag = false;
		String statement = "resource.GoodsMapper.deleteGoods";
		if (session.delete(statement, post_id) == 1) {
			flag = true;
		}
		return flag;
	}

	public int getCount() {
		String statement = "resource.GoodsMapper.getCountGoodsAll";
		return session.selectList(statement).size();
	}

	public int getCount(String mem_username) {
		String statement = "resource.GoodsMapper.getCountGoodsWriter";
		return session.selectList(statement, mem_username).size();
	}

	public int getCount(String key, String searchType) {
		String statement = "resource.GoodsMapper.getCountGoodsSearch";
		String searchExpr = "";
		if (searchType.equals("content")) {
			searchExpr = "post_content like '%" + key + "%'";
		} else if (searchType.equals("title")) {
			searchExpr = "post_title like '%" + key + "%'";
		} else if (searchType.equals("location")) {
			searchExpr = "post_location like '%" + key + "%'";
		} else {
			searchExpr = "post_title like '%" + key + "%'" + " or post_content like '%" + key + "%'"
					+ " or post_location like '%" + key + "%'";
		}
		SearchVO vo = new SearchVO();
		vo.setGetWritingStart(0);
		vo.setGetWritingEnd(0);
		vo.setSearchExpr(searchExpr);
		return session.selectList(statement, vo).size();
	}

	public String getPageLinkList(int curPage, String linkStr, int size) {
		PagingControl page = new PagingControl(10, 5, size, curPage);
		StringBuilder buffer = new StringBuilder();
		if (page.isPreData()) {
			buffer.append("<a href='/opalproject/goods?pgNum=");
			buffer.append((page.getPageStart() - 1) + linkStr + "'>");
			buffer.append("<img src='/opalproject/resources/imgp/left.png' width='45'></a> ");
		}
		for (int i = page.getPageStart(); i <= page.getPageEnd(); i++) {
			if (i == curPage) {
				buffer.append("<a href='/opalproject/goods?pgNum=" + i + linkStr + "'"
						+ " style='font-weight:bold;font-size:45px;'>" + i + "</a> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
			} else {
				buffer.append("<a href='/opalproject/goods?pgNum=" + i + linkStr + "'"
						+ " style='font-weight:bold;font-size:45px;'>" + i + "</a> ");
			}
		}
		if (page.isNextData()) {
			buffer.append("<a href='/opalproject/goods?pgNum=");
			buffer.append((page.getPageEnd() + 1) + linkStr + "'>");
			buffer.append(" <img src='/opalproject/resources/imgp/right.png' width='45'></a>");
		}
		return buffer.toString();
	}

	public List<GoodsVO> listAll(int curPage) {
		String statement = "resource.GoodsMapper.listAllGoods";
		Map<String, String> map = new HashMap<>();
		PagingControl page = new PagingControl(9, 5, getCount(), curPage);
		map.put("getWritingStart", Integer.toString(page.getWritingStart()));
		map.put("getWritingEnd", Integer.toString(page.getWritingEnd()));
		return session.selectList(statement, map);
	}

	public List<GoodsVO> listSort(String sortColumn, int curPage) {
		String statement = "resource.GoodsMapper.listSortGoods";
		PagingControl page = new PagingControl(9, 5, getCount(), curPage);
		Map<String, String> map = new HashMap<>();
		map.put("sortColumn", sortColumn);
		map.put("getWritingStart", Integer.toString(page.getWritingStart()));
		map.put("getWritingEnd", Integer.toString(page.getWritingEnd()));
		return session.selectList(statement, map);
	}

	public List<GoodsVO> search(String key, String searchType, int curPage) {
		String statement = "resource.GoodsMapper.searchGoods";
		String searchExpr = "";
		PagingControl page = new PagingControl(9, 5, getCount(key, searchType), curPage);
		if (searchType.equals("content")) {
			searchExpr = "post_content like '%" + key + "%'";
		} else if (searchType.equals("title")) {
			searchExpr = "post_title like '%" + key + "%'";
		} else {
			searchExpr = "post_title like '%" + key + "%'" + " or post_content like '%" + key + "%'";
		}
		SearchVO vo = new SearchVO();
		vo.setGetWritingStart(page.getWritingStart());
		vo.setGetWritingEnd(page.getWritingEnd());
		vo.setSearchExpr(searchExpr);
		return session.selectList(statement, vo);
	}

	public GoodsVO listOne(int post_id) {
		String statement = "resource.GoodsMapper.listOneGoods";
		String statement2 = "resource.GoodsMapper.AddPost_hit";
		session.update(statement2, post_id);
		return session.selectOne(statement, post_id);
	}

}