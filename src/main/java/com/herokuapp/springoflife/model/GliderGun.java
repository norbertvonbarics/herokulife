package com.herokuapp.springoflife.model;

import java.io.IOException;

public class GliderGun {
  Board board = new Board();
  int boardSize = board.getMulti()  .length;

  public GliderGun() throws IOException {
  }

  public void spacecraft(){
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        board.multi[i][j] = 0;
      }
    }
    board.setAlive(99,99);
    board.setAlive(98,98);
    board.setAlive(97, 97);
    board.setAlive(98,99);
    board.setAlive(98,100);
    board.setAlive(97,101);
    board.setAlive(96, 99);
    board.setAlive(95, 102);
    board.setAlive(94,102);
    board.setAlive(93,101);
    board.setAlive(92,100);
    board.setAlive(92,99);
    board.setAlive(92, 98);
    board.setAlive(93,97);
    board.setAlive(94,96);
    board.setAlive(95,96);
    board.setAlive(102,100);
    board.setAlive(103,100);
    board.setAlive(102,101);
    board.setAlive(103,101);
    board.setAlive(102,102);
    board.setAlive(103,102);
    board.setAlive(104,99);
    board.setAlive(104,103);
    board.setAlive(106,98);
    board.setAlive(106,99);
    board.setAlive(106,103);
    board.setAlive(106,104);
    board.setAlive(116,101);
    board.setAlive(117,101);
    board.setAlive(116,102);
    board.setAlive(117,102);
    board.setAlive(82,99);
    board.setAlive(83,99);
    board.setAlive(82,100);
    board.setAlive(83,100);
  }
}
