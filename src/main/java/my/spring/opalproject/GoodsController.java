package my.spring.opalproject;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import model.dao.GoodsDAO;
import model.vo.GoodsVO;

//@Controller
public class GoodsController {

	/*
	 * @Autowired GoodsDAO dao;
	 * 
	 * @RequestMapping(value="/goods", method=RequestMethod.GET) public ModelAndView
	 * doGet(@RequestParam(value = "action", required = false) String action,
	 * 
	 * @RequestParam(defaultValue = "1") int pgNum,
	 * 
	 * @RequestParam(value = "key", required = false) String key,
	 * 
	 * @RequestParam(value = "searchType", required = false) String searchType,
	 * 
	 * @RequestParam(defaultValue = "0") int post_id, HttpSession session) {
	 * ModelAndView mav = new ModelAndView(); List<GoodsVO> list; int count = 0;
	 * String linkStr = ""; if (action == null) { list = dao.listAll(pgNum);
	 * session.setAttribute("pgNum", pgNum); System.out.println("pgNum : " + pgNum);
	 * mav.addObject("msg", "��깰 �Ǹ� �Խ���"); if (list != null && list.size() != 0) {
	 * mav.addObject("list", list); } count = dao.getCount(); } else if
	 * (action.equals("sort")) { list = dao.listSort(key, pgNum);
	 * mav.addObject("msg", "��ǰ ����Ʈ(" + key + "����)"); if (list != null &&
	 * list.size() != 0) { mav.addObject("list", list); } count = dao.getCount();
	 * linkStr = "&action=sort&key=" + key; } else if (action.equals("listone")) {
	 * GoodsVO vo = dao.listOne(post_id); if (vo != null) {
	 * session.setAttribute("vo", vo); mav.addObject("msg", "��ǰ �󼼼���");
	 * mav.addObject("vo", vo); } } else if (action.equals("search")) { list =
	 * dao.search(key, searchType, pgNum); if (list != null && list.size() != 0) {
	 * mav.addObject("msg", key + "��(��) �����ϴ� �� ����Ʈ"); mav.addObject("list", list);
	 * count = dao.getCount(key, searchType); linkStr = "&searchType=" + searchType
	 * + "&key=" + key + "&action=search"; } else { mav.addObject("snull", key +
	 * "�� �����ϴ� �˻����� �����ϴ�."); } } else if (action.equals("delete")) {
	 * dao.delete(post_id); System.out.println("action : " + action);
	 * mav.setViewName("redirect:http://localhost:8000/opalproject/goods?pgNum=" +
	 * session.getAttribute("pgNum")); return mav; }
	 * 
	 * mav.addObject("totalCount", count); mav.addObject("pagelist", new
	 * GoodsDAO().getPageLinkList(pgNum, linkStr, count)); mav.addObject("pgNum",
	 * pgNum); mav.setViewName("goods"); return mav; }
	 */

}
