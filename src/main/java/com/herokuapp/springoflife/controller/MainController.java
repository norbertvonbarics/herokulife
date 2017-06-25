package com.herokuapp.springoflife.controller;

import com.herokuapp.springoflife.model.Board;
import com.herokuapp.springoflife.model.Engine;
import java.io.IOException;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainpage(Model model) throws IOException {

    Board board = new Board();
    Engine engine = new Engine();
    engine.engine();
    model.addAttribute("board", Arrays.deepToString(board.getMulti()));
    return "index";
  }

}
