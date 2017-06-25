package com.herokuapp.springoflife.model;
import java.io.IOException;
import lombok.Getter;

@Getter
public class LifeCycles {

  static int counter = 0;

  Neighbour neighbour = new Neighbour();
  Board board = new Board();
  int boardSize = board.getMulti().length;

  private int[][] toLive = new int[boardSize][boardSize];
  private int[][] toDead = new int[boardSize][boardSize];

  public LifeCycles() throws IOException {
  }

  int[][] makeThemLive() {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        if (neighbour.checkNeighbours(i, j) == 3) {
          toLive[i][j] = 1;
        } else {
          toLive[i][j] = 0;
        }
      }
    }
    return toLive;
  }

  int[][] makeThemDead() {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        if (neighbour.checkNeighbours(i, j) > 3) {
          toDead[i][j] = 0;
        } else if (neighbour.checkNeighbours(i, j) < 2) {
          toDead[i][j] = 0;
        } else {
          toDead[i][j] = 1;
        }
      }
    }
    return toDead;
  }

  void lifeCycle() {
    makeThemLive();
    makeThemDead();
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {

        if (toLive[i][j] == 1 && toDead[i][j] == 1) {
          board.setAlive(i, j);
        }
        if (toLive[i][j] == 0 && toDead[i][j] == 0) {
          board.setDead(i, j);
        }
      }
    }
    counter++;
  }
}