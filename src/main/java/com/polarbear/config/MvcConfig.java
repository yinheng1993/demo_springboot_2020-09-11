package com.polarbear.config;

import com.polarbear.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author polarbear
 * @create 2020/9/11 11:45
 * @description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer
{
    /**
     * 将拦截器注册到spring ioc容器
     */
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }

    /**
     * 重写该方法：往拦截器链添加自定义拦截器
     */
    public void addInterceptors(InterceptorRegistry registry){
        //通过registry添加myInterceptor拦截器，并设置拦截器路径为/*
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
    }
}
