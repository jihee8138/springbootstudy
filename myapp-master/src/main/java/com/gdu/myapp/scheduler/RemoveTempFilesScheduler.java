package com.gdu.myapp.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gdu.myapp.service.UploadService;

import lombok.RequiredArgsConstructor;

public class RemoveTempFilesScheduler {

  @Autowired	
  private UploadService uploadService;   
  
  @Scheduled(cron="0 28 12 * * ?")
  public void execute() {
    uploadService.removeTempFiles();
  }
  
}
