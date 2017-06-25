package com.herokuapp.springoflife.model;

import java.io.IOException;

class Neighbour {
  Board board = new Board();
  int boardSize = board.getMulti().length;
  Alive alive = new Alive();

  Neighbour() throws IOException {
  }

  int checkNeighbours(int posX, int posY) {
    int counter = 0;

    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        if (posX > 0 && posX < boardSize - 1 && posY > 0
            && posY < boardSize - 1
            && alive.isAlive(i + posX, j + posY)) {
          if (j == 0 && i == 0 && alive.isAlive(posX, posY)) {
            counter--;

          }
          counter++;
        }
      }
    }
    return counter;
  }
}
