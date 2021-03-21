package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private double nUsers;
    private double nPosts;
    private double nComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        nUsers = statistics.usersNames().size();
        nPosts = statistics.postsCount();
        nComments = statistics.commentsCount();
        if (nUsers > 0) {
            avgPostsPerUser = nPosts / nUsers;
            avgCommentsPerUser = nComments / nUsers;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }
        if (nPosts > 0)
            avgCommentsPerPost = nComments / nPosts;
        else
            avgCommentsPerPost = 0;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("nUsers = " + nUsers);
        System.out.println("nPosts = " + nPosts);
        System.out.println("nComments = " + nComments);
        System.out.println("avgPostsPerUser = " + avgPostsPerUser);
        System.out.println("avgCommentsPerUser = " + avgCommentsPerUser);
        System.out.println("avgCommentsPerPost = " + avgCommentsPerPost);
    }
}
