package com.epam.jwd.validation;

import com.epam.jwd.entity.Dot;
import java.util.ArrayList;

public class IncomeValidator {

    public boolean checkCalculation() {
        return true;
    }
    
    public boolean checkWriting( ArrayList <String> incomeString){
        if (incomeString == null) {
            
        }
        return true;
    }
    
    public boolean checkPoints (double dot1, double dot2, double dot3) {
        if(dot1 == dot2 && dot1 ==dot3){
            return false;
        }
            else{
            if(dot2 == dot1 && dot2 ==dot3){
                return false;
            }
            
        }
        return true;
    }

    public boolean

}
