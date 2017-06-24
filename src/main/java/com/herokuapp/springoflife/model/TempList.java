package com.herokuapp.springoflife.model;

import com.herokuapp.springoflife.model.Board;
import java.util.ArrayList;

class TempList {

  ArrayList<Tile> temp() {
    ArrayList<Tile> tempList = new ArrayList<>();

    for (int i = 0; i < Board.array2d().length; i++) {
      for (int j = 0; j < Board.array2d().length; j++) {

        Tile newTile = new Tile(i, j, Alive.isAlive(i, j));

        if (newTile.alive) {
          tempList.add(newTile);
        }
      }
    }
    return tempList;
  }
}
