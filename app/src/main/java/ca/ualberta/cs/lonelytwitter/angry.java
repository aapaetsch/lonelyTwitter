package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aapae on 1/19/2018.
 */

public class angry extends CurrentMood {

    angry(){
        super();
    }
    angry(Date date){
        super(date);
    }
    @Override
    public String MoodExpression(){
        return "angry";
    }
}
