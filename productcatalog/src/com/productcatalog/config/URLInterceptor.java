package com.productcatalog.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class URLInterceptor implements HandlerInterceptor {

	public URLInterceptor() {
		System.out.println("URLInterceptor Started");
	}
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			System.out.println("Accessed URL "+request.getRequestURI());
			return HandlerInterceptor.super.preHandle(request, response, handler);
		}
}
