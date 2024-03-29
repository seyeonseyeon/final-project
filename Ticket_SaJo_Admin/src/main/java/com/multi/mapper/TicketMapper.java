package com.multi.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.TicketVO;

@Repository
@Mapper
public interface TicketMapper {
	public void insert(TicketVO genre) throws Exception;
	public void delete(int id) throws Exception;
	public void update(TicketVO genre) throws Exception;
	public TicketVO select(int id) throws Exception;
	public List<TicketVO> selectall() throws Exception;

	
	public List<TicketVO> selectrid(int rid) throws Exception;
	
	public List<TicketVO> selectsid(int sid) throws Exception;
	
	//0811 안원영 추가 - 오늘 예약 수
	public int todayticketBuyCnt(Date date) throws Exception;
}
