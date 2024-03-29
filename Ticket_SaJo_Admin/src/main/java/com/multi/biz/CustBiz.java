package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CustMapper;
import com.multi.vo.CustVO;

@Service("custbiz")
public class CustBiz implements Biz<String,CustVO> {

	@Autowired
	CustMapper dao;
	
	@Override
	public void register(CustVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CustVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public CustVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CustVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void modifycust(CustVO v) throws Exception {
		dao.updatecust(v);
	}
	public void usepoint(String id,int usepoint) throws Exception {
		dao.usepoint(id, usepoint);
	}
	public List<CustVO> selectallpage(Integer mnum) throws Exception {
		return dao.selectallpage(mnum);
	}
	public List<CustVO> searchall(String text) throws Exception {
		return dao.searchall(text);
	}
	
	//0811 안원영 추가 - 회원수 출력 
	public int selectCustCnt() throws Exception {
		return dao.selectCustCnt();
	}
	//0811 안원영 추가 - 탈퇴 회원수 출력 
	public int selectExitCnt() throws Exception {
		return dao.selectExitCnt();
	}
}
