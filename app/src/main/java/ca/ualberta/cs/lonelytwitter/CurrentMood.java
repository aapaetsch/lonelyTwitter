package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aapae on 1/19/2018.
 */


public abstract class CurrentMood {
    private Date date;
    // default date
    CurrentMood(){
    }
    CurrentMood(Date date){
        this.date = date;

    }


    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }

}
