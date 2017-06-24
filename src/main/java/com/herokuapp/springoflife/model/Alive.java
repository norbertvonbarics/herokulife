package com.herokuapp.springoflife.model;

class Alive {

  Board board = new Board();

  boolean isAlive(int posX, int posY) {
    return (board.array2d()[posX][posY] == 1);
  }
}
