package com.herokuapp.springoflife.model;

import java.util.ArrayList;

public class Engine {

  private LifeCycles lifecycles = new LifeCycles();
  private ThreadSleep threadSleep = new ThreadSleep();
  private GliderGun gliderGun = new GliderGun();


  public boolean engine() {
    boolean methodCheck = true;

    try {

      //myArray.fillLists();
      gliderGun.spacecraft();

      threadSleep.sleep();

      lifecycles.lifeCycle();
    } catch (Exception ex) {
      methodCheck = false;
    }

    return methodCheck;
  }
}