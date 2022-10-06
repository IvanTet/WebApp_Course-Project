package com.epam.jwd.validation;

import com.epam.jwd.entity.Dot;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncomeValidator {

    private final static String REGEXP = "";
    private final static Logger LOG = LogManager.getLogger(IncomeValidator.class);

    public static boolean checkWriting(String incomeString){
        if (incomeString != null) {
            LOG.info("Starting writing check");
            final Pattern pattern = Pattern.compile(REGEXP, Pattern.CASE_INSENSITIVE);
            final Matcher matcher = pattern.matcher(incomeString);
            LOG.info("Ending checking");
            return matcher.matches();
        }
        LOG.info("ERROR : Empty string");
        return false;
    }
    
    public static boolean checkPoints (double dot1, double dot2, double dot3) {
        LOG.info("Starting line check");
        if(dot1 == dot2 && dot1 ==dot3){
            LOG.info("ERROR : 3 points on 1 line");
            return false;
        }
            else{
            if(dot2 == dot1 && dot2 ==dot3){
                LOG.info("ERROR : 3 points on 1 line");
                return false;
            }
            
        }
        LOG.info("Ending checking");
        return true;
    }

}
