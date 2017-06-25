package com.herokuapp.springoflife.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.herokuapp.springoflife.model.Board;
import com.herokuapp.springoflife.model.GliderGun;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOService {


  private static final String ERROR = "SYNTAX ERROR: ";
  final int size = 50;
  Board board = new Board();

  public IOService() throws IOException {
  }

  public Board readFiles(String datapath) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    List<String> rawLines = new ArrayList<>();
    Path myPath = Paths.get(datapath);
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println(ERROR + "READ");
      writeNewFile(datapath);
    }

    StringBuilder fileContentConvertedToJson = new StringBuilder();
    for (String rawLine : rawLines) {
      fileContentConvertedToJson.append(rawLine);
    }
    return mapper.readValue(fileContentConvertedToJson.toString(), Board.class);
  }

  public boolean writeToFile(String datapath)
      throws JsonProcessingException {
    boolean runTimeChecker = true;

    Path myPath = Paths.get(datapath);
    List<String> dataString = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();
    dataString.add(mapper.writeValueAsString(board));

    try {
      Files.write(myPath, dataString);
    } catch (IOException ex) {
      System.out.println(ERROR + "WRITE");
      runTimeChecker = false;
    }
    return runTimeChecker;
  }

  public boolean writeNewFile(String datapath) throws IOException {
    boolean runTimeChecker = true;

    int multi[][] = new int[size][size];
    Board boardList = new Board(multi);

    GliderGun gliderGun = new GliderGun();
    gliderGun.spacecraft();

    Path myPath = Paths.get(datapath);
    List<String> dataString = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();
    dataString.add(mapper.writeValueAsString(boardList));

    try {
      Files.write(myPath, dataString);
    } catch (IOException ex) {
      System.out.println(ERROR + "WRITE");
      runTimeChecker = false;
    }
    return runTimeChecker;
  }
}

