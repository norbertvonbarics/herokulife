package com.herokuapp.springoflife.model;

public class Board {

  final int size = 200;
  int[][] multi = new int[size][size];

  void setDead(int posX, int posY) {
    multi[posX][posY] = 0;
  }

  void setAlive(int posX, int posY) {
    multi[posX][posY] = 1;
  }

  void fillLists() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j < 150 && j > 50 && i < 150 && i > 50) {
          int random = (int) (Math.random() * 2);
          multi[i][j] = random;
        } else {
          multi[i][j] = 0;
        }
      }
    }
  }

  public int[][] array2d() {
    return multi;
  }

  String arrayToString() {
    String map = "";
    for (int[] aMulti : multi) {
      for (int j = 0; j < multi.length; j++) {
        map += aMulti[j] + " ";
      }
      map += "\n";
    }
    return map;
  }
}