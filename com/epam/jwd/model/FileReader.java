package com.epam.jwd.model;

import com.epam.jwd.validation.*;
import com.epam.jwd.entity.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

  public static  ArrayList read(ArrayList<Triangle> figures, String filename) throws RuntimeException {
      List<String> lines;
      try {
          lines = Files.readAllLines(Paths.get(filename), Charset.defaultCharset());
      } catch (RuntimeException | IOException e) {
          throw new RuntimeException("invalid arguments");
      }
      for (String line : lines) {
          if(IncomeValidator.checkWriting(line))
          String [] splitted = line.split(";");


      }

      return figures;
  }

}
