package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aapae on 1/19/2018.
 */

public class Mad extends CurrentMood {
    Mad(){
        super();

    }
    Mad(Date date){
        super(date);
    }
    @Override
    public String MoodExpression(){
        return "Mad";
    }
}
