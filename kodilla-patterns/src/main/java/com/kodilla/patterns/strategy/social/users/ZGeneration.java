package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.publisher = new SnapchatPublisher();
    }
}
