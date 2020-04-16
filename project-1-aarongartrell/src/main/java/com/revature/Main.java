package com.revature;

import com.revature.controller.Controller;
import java.util.logging.Logger;


public class Main {

  
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    final Logger logger = Logger.getAnonymousLogger();
    Controller rc = new Controller();
    rc.start();
    }
}