package com.herokuapp.springoflife.model;

import com.herokuapp.springoflife.service.IOService;
import java.io.IOException;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Board {

  private static final String DATAPATH = "./src/main/resources/boardlist.json";

  IOService ioService = new IOService();
  int[][] multi = ioService.readFiles(DATAPATH).getMulti();

  public Board() throws IOException {
  }

  public Board(int[][] multi) throws IOException {
    this.multi = multi;
  }

  void setDead(int posX, int posY) {
    multi[posX][posY] = 0;
  }

  void setAlive(int posX, int posY) {
    multi[posX][posY] = 1;
  }

  void fillLists() {
    for (int i = 0; i < multi.length; i++) {
      for (int j = 0; j < multi.length; j++) {
        if (j < 150 && j > 50 && i < 150 && i > 50) {
          int random = (int) (Math.random() * 2);
          multi[i][j] = random;
        } else {
          multi[i][j] = 0;
        }
      }
    }
  }
}