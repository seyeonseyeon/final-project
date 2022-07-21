package com.multi.mycoupon;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MycouponBiz;
import com.multi.vo.MycouponVO;

@SpringBootTest
class InsertTest {
	
	@Autowired
	MycouponBiz biz;
	
	@Test
	void contextLoads() {
		Date date = new Date();
		
		MycouponVO v = new MycouponVO("awy",8001,true,date);
		try {
			biz.register(v);
			System.out.println("insert ok... ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
