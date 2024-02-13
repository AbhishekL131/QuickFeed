package com.example.quickfeed;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class MainNews {

    private String status;
    private String totalresults;

    private ArrayList<ModelClass> articles;

    public MainNews(String status,String totalresults,ArrayList<ModelClass> articles){
        this.status = status;
        this.articles = articles;
        this.totalresults = totalresults;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public String getTotalresults() {
        return totalresults;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }

    public void setTotalresults(String totalresults) {
        this.totalresults = totalresults;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
