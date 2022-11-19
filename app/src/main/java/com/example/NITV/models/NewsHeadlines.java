package com.example.NITV.models;

import java.io.Serializable;

public class NewsHeadlines implements Serializable {
    Source source =null;
    String author="";
    String title="";
    String description="";
    String url="";
    String urlToImage="";
    String publishedAt="";
    String content="";

    public Source getSource() {
        return source;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getUrl() {
        return url;
    }
    public String getUrlToImage() {
        return urlToImage;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public String getContent() {
        return content;
    }
}
