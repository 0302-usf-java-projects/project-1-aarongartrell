package com.revature.controller;

import java.util.logging.Logger;
import com.revature.service.Service;

public class Controller {
private static final Logger logger = Logger.getLogger(Controller.class.getName());

  
  public void start() {
    Service s = new Service();
    logger.info("Test message start method");
    
  }
  
  
}
