package com.productcatalog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.productcatalog.comntrollers")
public class SetUpConfig implements WebMvcConfigurer {

	public SetUpConfig() {
		System.out.println("Product SetUpConfig Started");
	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry)
	{
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/jsps/");
		view.setSuffix(".jsp");
		registry.viewResolver(view);
		
	}
	@Override
	public void addInterceptors(InterceptorRegistry intercept)
	{
		intercept.addInterceptor(new URLInterceptor());
	}
}
