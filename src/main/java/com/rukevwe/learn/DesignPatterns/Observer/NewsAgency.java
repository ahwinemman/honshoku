package com.rukevwe.learn.DesignPatterns.Observer;

import java.util.Observable;

public class NewsAgency extends Observable {
   
    private String news;
    
    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
