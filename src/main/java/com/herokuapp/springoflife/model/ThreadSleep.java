package com.herokuapp.springoflife.model;

class ThreadSleep {

  void sleep() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
