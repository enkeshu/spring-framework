package org.springframework.enkeshu.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springframework.enkeshu.ioc")
public class IocConfig {
	@Bean
	public Personal personal() {
		Personal personal = new Personal();
		personal.setAge(1);
		return personal;
	}
}
