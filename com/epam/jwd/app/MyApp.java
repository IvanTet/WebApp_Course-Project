package com.epam.jwd.app;

import com.epam.jwd.model.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {

    private static final Logger LOG = LogManager.getLogger(MyApp.class);

    public static void main (String[] args){
       LOG.info("Programm Started");
        int A = 6;
        int B = 4;
        int rezult = Math.Summ(A, B);
        System.out.println("Hello User!" + rezult);
    }
}