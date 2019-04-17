package com.example.dashboard2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.dashboard2")
public class DashboardConfig implements WebMvcConfigurer{
	
	//private final String[] resourceLocations = {"classpath:/resources/**","classpath:/resources/images/**",
	//		"classpath:/resources/libs/**", "classpath:/resources/vendor/**"};

	/////////////////////////////////////////////////////////////////////////////////
	// BEAN DEFINITIONS
	/////////////////////////////////////////////////////////////////////////////////
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/view/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// RESOURCE LOCATIONS
	/////////////////////////////////////////////////////////////////////////////////
	
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
