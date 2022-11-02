package com.memo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.memo.common.FileManagerService;
import com.memo.interceptor.PermissionInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Autowired
	private PermissionInterceptor interceptor;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/images/**")	// 웹 주소 (url path)
		// 맥은 / 한개, 윈도우는 / 3개
		.addResourceLocations("file:///" + FileManagerService.FILE_UPLOAD_PATH);	// 실제 파일 위치 경로(이미지)
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
		.addInterceptor(interceptor)
		.addPathPatterns("/**")	// /post/post_list_view(/** -> 모든 요청에 대해서 interceptor를 한다.) 아래 디렉토리까지 확인
		.excludePathPatterns("/favicon.ico", "/error", "/user/sign_out", "/static/**");
	}
}
