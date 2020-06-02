package com.nikorych.chatapp;

public class Message {
    private String author;
    private String textOfMessage;
    private long date;
    private String ImageURL;

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }

    public Message(String author, String textOfMessage, long date, String ImageURL) {
        this.author = author;
        this.textOfMessage = textOfMessage;
        this.date = date;
        this.ImageURL = ImageURL;
    }

    public Message() {
    }
}
