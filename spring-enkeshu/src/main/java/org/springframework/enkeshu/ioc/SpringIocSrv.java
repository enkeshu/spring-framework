package org.springframework.enkeshu.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocSrv {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfig.class);
		Personal personal = applicationContext.getBean("personal", Personal.class);
		System.out.println(personal.getAge());
	}
}
