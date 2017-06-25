package com.herokuapp.springoflife.model;

import java.io.IOException;

class Alive {

  Board board = new Board();

  Alive() throws IOException {
  }

  boolean isAlive(int posX, int posY) {
    return (board.getMulti()[posX][posY] == 1);
  }
}
