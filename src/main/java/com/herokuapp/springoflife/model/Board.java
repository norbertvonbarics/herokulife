package com.herokuapp.springoflife.model;

public class Board {

  static final int size = 200;
  static int[][] multi = new int[size][size];

  static void setDead(int posX, int posY) {
    multi[posX][posY] = 0;
  }

  static void setAlive(int posX, int posY) {
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

  static int[][] array2d() {
    return multi;
  }

  static String arrayToString() {
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