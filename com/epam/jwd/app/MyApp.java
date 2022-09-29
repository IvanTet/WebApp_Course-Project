package com.epam.jwd.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;

public class MyApp {

    private static final Logger LOG = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {
        LOG.info("Program Started");
        try (FileReader reader = new FileReader("DATA.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}