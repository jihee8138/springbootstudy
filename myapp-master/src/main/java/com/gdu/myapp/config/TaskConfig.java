package com.gdu.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.gdu.myapp.scheduler.RemoveBlogImageScheduler;
import com.gdu.myapp.scheduler.RemoveTempFilesScheduler;

@EnableScheduling
@Configuration
public class TaskConfig {
	@Bean
	RemoveBlogImageScheduler removeBlogImageTask() {
		return new RemoveBlogImageScheduler();
	}
	@Bean
	RemoveTempFilesScheduler removeTempFileTask() {
		return new RemoveTempFilesScheduler();
	}
}
