package com.herokuapp.springoflife.controller;

import com.herokuapp.springoflife.model.Board;
import com.herokuapp.springoflife.model.Engine;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/json")
  public int[][] jsonArray() throws IOException {
//ez itt egy new comment
//ez meg egy newabb

    Engine engine = new Engine();
    engine.engine();
    Board board = new Board();
    return board.getMulti();
  }
}
