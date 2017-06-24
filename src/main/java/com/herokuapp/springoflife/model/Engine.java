package com.herokuapp.springoflife.model;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Engine extends JComponent {

  private LifeCycles lifecycles = new LifeCycles();
  private ThreadSleep threadSleep = new ThreadSleep();
  private TempList tempList = new TempList();
  private Statics statics = new Statics();
  private ArrayList<Tile> newTileList = new ArrayList<>();
  private int dimension = 800;


  public Engine() {
    setPreferredSize(new Dimension(dimension, dimension));
    setVisible(true);

    //myArray.fillLists();
    GliderGun.spacecraft();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (Tile aNewTileList : newTileList) {
      graphics.setColor(Color.black);
      graphics
          .fillRect(aNewTileList.posX * dimension / Board.array2d().length,
              aNewTileList.posY * dimension / Board.array2d().length,
              dimension / Board.array2d().length, dimension / Board.array2d().length);
    }
    newTileList = tempList.temp();

    graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    graphics.drawString("Life cycle: " + LifeCycles.counter, 820, 40);
    graphics.drawString("There are " + newTileList.size() + " Bitizen alive!", 820, 80);
    graphics.drawString("Min: " + statics.getMinBitizen(newTileList.size()), 820, 120);
    graphics.drawString("Max: " + statics.getMaxBitizen(newTileList.size()), 820, 140);

    threadSleep.sleep();

    lifecycles.lifeCycle();
    repaint();
  }
}