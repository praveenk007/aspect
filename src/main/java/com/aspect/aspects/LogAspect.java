package com.aspect.aspects;

import com.aspect.service.IEmployeeService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

/**
 * @author praveenkamath
 **/
@Aspect
@Configuration
public class LogAspect {

    @Autowired
    @Qualifier("employeeService")
    IEmployeeService employeeService;

    /*@Before("execution(* com.aspect.service.IEmployeeService.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("before : "+joinPoint);
    }*/

    @Around("execution(* com.aspect.service.IEmployeeService.isValidEmployee(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        employeeService.fetchEmployee("dd");
        Object[] obj = proceedingJoinPoint.getArgs();
        String s = (String) obj[0];
        if(s.equalsIgnoreCase("pk")) {
            return proceedingJoinPoint.proceed();
        } return false;
    }
}
