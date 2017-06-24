package com.herokuapp.springoflife.model;

class Neighbour {
  Board board = new Board();
  int boardSize = board.array2d().length;
  Alive alive = new Alive();

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
