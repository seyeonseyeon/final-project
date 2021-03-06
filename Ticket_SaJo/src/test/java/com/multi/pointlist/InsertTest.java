package com.multi.pointlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.PointlistBiz;
import com.multi.vo.PointlistVO;

@SpringBootTest
class InsertTest {
	
	@Autowired
	PointlistBiz biz;
	
	@Test
	void contextLoads() {
		PointlistVO pl = new PointlistVO("hms", 4000, "쿠폰5");
		try {
			biz.register(pl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}