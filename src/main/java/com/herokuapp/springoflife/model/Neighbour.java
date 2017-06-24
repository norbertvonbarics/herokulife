package com.herokuapp.springoflife.model;

class Neighbour {

  static int checkNeighbours(int posX, int posY) {
    int counter = 0;
/*
    if (posX > 0 && Alive.isAlive(posX - 1, posY)) {
      counter++;
    }
    if (posX > 0 && posY < Board.size - 1 && Alive.isAlive(posX - 1, posY + 1)) {
      counter++;
    }
    if (posY > 0 && Alive.isAlive(posX, posY - 1)) {
      counter++;
    }
    if (posY > 0 && posX < Board.size - 1 && Alive.isAlive(posX + 1, posY - 1)) {
      counter++;
    }
    if (posX > 0 && posY > 0 && Alive.isAlive(posX - 1, posY - 1)) {
      counter++;
    }
    if (posX < Board.size - 1 && Alive.isAlive(posX + 1, posY)) {
      counter++;
    }
    if (posY < Board.size - 1 && Alive.isAlive(posX, posY + 1)) {
      counter++;
    }
    if (posX < Board.size - 1 && posY < Board.size - 1 && Alive.isAlive(posX + 1, posY + 1)) {
      counter++;
    }*/

    //infinite grid if statements

    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        if (posX > 0 && posX < Board.multi.length - 1 && posY > 0
            && posY < Board.multi.length - 1
            && Alive.isAlive(i + posX, j + posY)) {
          if (j == 0 && i == 0 && Alive.isAlive(posX, posY)) {
            counter--;

          }
          counter++;
        }
      }
    }

    return counter;
  }
}
