package com.multi.movie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MovieBiz;
import com.multi.vo.MovieVO;

@SpringBootTest
class SelectTest {
	@Autowired
	MovieBiz biz;
	@Test
	void contextLoads() {
		MovieVO v = null;
		try {
			int[] array1 = {1,2,3,4,5,6,7,8,9,10};
			int[] array2 = {4,5};
			
			for (int i : array2) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
