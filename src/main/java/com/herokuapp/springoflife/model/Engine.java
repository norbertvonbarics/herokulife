package com.herokuapp.springoflife.model;

import java.io.IOException;
import java.util.ArrayList;

public class Engine {

  private LifeCycles lifecycles = new LifeCycles();
  private ThreadSleep threadSleep = new ThreadSleep();

  public Engine() throws IOException {
  }


  public boolean engine() {
    boolean methodCheck = true;

    try {

      //myArray.fillLists();

      threadSleep.sleep();

      lifecycles.lifeCycle();
    } catch (Exception ex) {
      methodCheck = false;
    }

    return methodCheck;
  }
}