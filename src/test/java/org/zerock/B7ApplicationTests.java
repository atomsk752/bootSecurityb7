package org.zerock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.java.Log;

@Log
@RunWith(SpringRunner.class)
@SpringBootTest
public class B7ApplicationTests {
	
	@Setter(onMethod_=@Autowired)
	private TimeMapper mapper;
	
	@Test
	public void getTime() {
		
		log.info(mapper.getTime2());
	}

	@Test
	public void contextLoads() {
	}

}
