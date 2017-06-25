package com.herokuapp.springoflife.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
class Statics {

  private int minBitizen;
  private int maxBitizen;

  int getMinBitizen(int numberAlive) {
    if (numberAlive < minBitizen) {
      minBitizen = numberAlive;
    }
    return minBitizen;
  }

  int getMaxBitizen(int numberAlive) {
    if (numberAlive > maxBitizen) {
      maxBitizen = numberAlive;
    }
    return maxBitizen;
  }
}
