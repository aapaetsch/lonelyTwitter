package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aapae on 1/17/2018.
 */
import java.util.Date;
public class ImportantTweet extends Tweet{
    ImportantTweet(String message){
        super(message);
    }
    ImportantTweet(String message, Date date){
        super(message, date);
    }
    public String getMessage(){
        return "hi";
    }
    @Override
    public boolean isImportant(){
        return true;
    }
}
