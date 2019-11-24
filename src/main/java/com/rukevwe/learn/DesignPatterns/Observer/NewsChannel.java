package com.rukevwe.learn.DesignPatterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {
    
    private String news;
    
    @Override
    public void update(Observable o, Object arg) {
        this.setNews((String) news);
    }
    public void setNews(String news) {
        this.news = news;
    }
}


//    ONewsAgency observable = new ONewsAgency();
//    ONewsChannel observer = new ONewsChannel();
// 
//observable.addObserver(observer);
//        observable.setNews("news");
//        assertEquals(observer.getNews(), "news");