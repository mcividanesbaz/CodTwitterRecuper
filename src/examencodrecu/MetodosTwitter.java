/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencodrecu;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Marcos
 */
public class MetodosTwitter {
 Twitter twitter;
    /*
     constructor que da acceso a nuestra cuenta de twitter
     */
    public MetodosTwitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("sfykEWIIWMM60T0apJFNGmc9n")
                .setOAuthConsumerSecret("DnFd8UbiNXcxoHhei4kQ4wMsctTHjI8MkW0fqVjCdSfdWaSBqW")
                .setOAuthAccessToken("867802357-6hZ73Bu9QVD8ExLFmeJkarBsmOXXNgBMZXxp3sH1")
                .setOAuthAccessTokenSecret("R9rGWgmyoUW5vz0wHypXNlgZn7F7ArU7mGf3Ibies6h6d");

        twitter = new TwitterFactory(cb.build()).getInstance();

    }
public void verLineaTiempo() throws TwitterException{
    
     List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
}
}



}
