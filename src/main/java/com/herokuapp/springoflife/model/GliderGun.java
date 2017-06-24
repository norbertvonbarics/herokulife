package com.herokuapp.springoflife.model;

import com.herokuapp.springoflife.model.Board;

public class GliderGun {
  Board myArray = new Board();

  static void spacecraft(){
    for (int i = 0; i < Board.size; i++) {
      for (int j = 0; j < Board.size; j++) {
        Board.multi[i][j] = 0;
      }
    }
    Board.setAlive(99,99);
    Board.setAlive(98,98);
    Board.setAlive(97, 97);
    Board.setAlive(98,99);
    Board.setAlive(98,100);
    Board.setAlive(97,101);
    Board.setAlive(96, 99);
    Board.setAlive(95, 102);
    Board.setAlive(94,102);
    Board.setAlive(93,101);
    Board.setAlive(92,100);
    Board.setAlive(92,99);
    Board.setAlive(92, 98);
    Board.setAlive(93,97);
    Board.setAlive(94,96);
    Board.setAlive(95,96);
    Board.setAlive(102,100);
    Board.setAlive(103,100);
    Board.setAlive(102,101);
    Board.setAlive(103,101);
    Board.setAlive(102,102);
    Board.setAlive(103,102);
    Board.setAlive(104,99);
    Board.setAlive(104,103);
    Board.setAlive(106,98);
    Board.setAlive(106,99);
    Board.setAlive(106,103);
    Board.setAlive(106,104);
    Board.setAlive(116,101);
    Board.setAlive(117,101);
    Board.setAlive(116,102);
    Board.setAlive(117,102);
    Board.setAlive(82,99);
    Board.setAlive(83,99);
    Board.setAlive(82,100);
    Board.setAlive(83,100);
  }
}
