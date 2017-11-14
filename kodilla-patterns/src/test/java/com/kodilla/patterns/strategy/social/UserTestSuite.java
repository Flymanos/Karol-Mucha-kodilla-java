package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //given
        User user = new YGeneration("Janusz");
        User user1 = new ZGeneration("Grzegorz");
        User user2 = new Millenials("Brajanek");
        //when
        //then
        Assert.assertEquals("Facebook", user.sharePost());
        Assert.assertEquals("Twitter", user1.sharePost());
        Assert.assertEquals("Snapchat", user2.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy(){
        //given
        User user = new YGeneration("Janusz");
        User user1 = new ZGeneration("Grzegorz");
        User user2 = new Millenials("Brajanek");
        //when
        user.setSocialPublisher(new SnapchatPublisher());
        user1.setSocialPublisher(new TwitterPublisher());
        user2.setSocialPublisher(new FacebookPublisher());
        //then
        Assert.assertEquals("Snapchat", user.sharePost());
        Assert.assertEquals("Twitter", user1.sharePost());
        Assert.assertEquals("Facebook", user2.sharePost());
    }
}
