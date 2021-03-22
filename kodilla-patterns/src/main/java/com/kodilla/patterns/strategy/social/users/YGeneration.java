package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.publisher = new TwitterPublisher();
    }
}
