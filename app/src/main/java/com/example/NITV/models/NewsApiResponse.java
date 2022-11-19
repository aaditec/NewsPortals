package com.example.NITV.models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    List<NewsHeadlines> articles;
    public List<NewsHeadlines> getArticles() {
        return articles;
    }
}
