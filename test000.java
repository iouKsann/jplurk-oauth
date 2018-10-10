package com.google.jplurk_oauth.example;

import java.util.Properties;

import com.google.jplurk_oauth.Qualifier;
import com.google.jplurk_oauth.module.Timeline;
import com.google.jplurk_oauth.skeleton.PlurkOAuth;
import com.google.jplurk_oauth.skeleton.RequestException;

public class Example {
    public static void main(String[] args) throws RequestException {
        Properties prop = System.getProperties();
        
        /* create oauth config */
        PlurkOAuth auth = new PlurkOAuth(
                prop.getProperty(Y4WPPY8PxO84), prop.getProperty(bumhudIq9Ij8qUERjjO6GOagbYOEe6tO), 
                prop.getProperty(WAqp5R2cfbLk), prop.getProperty(5zwen6eOyQagmmV7ynEdc2au8IiCLxE5));
        
        auth.using(Timeline.class).plurkAdd("¶Ù J¼P®öOAuth", Qualifier.SAYS);
    }
}