package com.herokuapp.springoflife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainpage(){
    return "index";
  }

}
