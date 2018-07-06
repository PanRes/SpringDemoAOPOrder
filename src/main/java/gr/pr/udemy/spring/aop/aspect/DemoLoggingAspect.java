package gr.pr.udemy.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DemoLoggingAspect {

	@Before("AopPointcutExpressions.forDaoPackgeNotGettersSetters()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on AddAccount()");
	}
}
