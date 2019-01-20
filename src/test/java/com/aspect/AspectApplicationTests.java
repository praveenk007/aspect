package com.aspect;

import com.aspect.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectApplicationTests {

	@Autowired
	@Qualifier("employeeService")
	IEmployeeService employeeService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
		employeeService.fetchEmployee("id");
		System.out.println(employeeService.isValidEmployee("pk"));
	}
}

