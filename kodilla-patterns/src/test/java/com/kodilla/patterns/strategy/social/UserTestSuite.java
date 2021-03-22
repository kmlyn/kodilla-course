package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("John");
        YGeneration yGeneration = new YGeneration("Joan");
        ZGeneration zGeneration = new ZGeneration("Jake");
        //When
        String mSocial = millenials.sharePost();
        String ySocial = yGeneration.sharePost();
        String zSocial = zGeneration.sharePost();
        //Then
        assertEquals("Facebook", mSocial);
        assertEquals("Twitter", ySocial);
        assertEquals("Snapchat", zSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("John");
        //When
        millenials.setPublisher(new SnapchatPublisher());
        String mSocial = millenials.sharePost();
        //Then
        assertEquals("Snapchat", mSocial);
    }
}
