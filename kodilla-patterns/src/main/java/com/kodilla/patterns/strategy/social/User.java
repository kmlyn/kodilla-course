package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return publisher.share();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SocialPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
