package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aapae on 1/17/2018.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
