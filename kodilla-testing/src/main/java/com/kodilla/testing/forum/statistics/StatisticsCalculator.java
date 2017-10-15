package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int usersCount;
    int postsCount;
    int commentsCount;
    double postsUserAvg;
    double commentsUserAvg;
    double commentsPostAvg;

    public void calculateAdvStatistics(Statistics statistics){
        setUsersCount(statistics.usersNames().size());
        setPostsCount(statistics.postsCount());
        setCommentsCount(statistics.commentsCount());
        setPostsUserAvg(getPostsCount(), getUsersCount());
        setCommentsUserAvg(getCommentsCount(), getUsersCount());
        setCommentsPostAvg(getCommentsCount(), getPostsCount());
    }

    public void showStatistics(){
        System.out.println("Comments: " + getCommentsCount());
        System.out.println("Users: " + getUsersCount());
        System.out.println("Posts: " + getPostsCount());
        System.out.println("Posts per User: " + getPostsUserAvg());
        System.out.println("Comments per User: " + getCommentsUserAvg());
        System.out.println("Comments per Post: " + getCommentsPostAvg());
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public double getPostsUserAvg() {
        return postsUserAvg;
    }

    public void setPostsUserAvg(int posts, int users) {
        if (posts == 0 || users == 0){
            this.postsUserAvg = 0;
        }
        else this.postsUserAvg = (double)posts / (double)users;
    }

    public double getCommentsUserAvg() {
        return commentsUserAvg;
    }

    public void setCommentsUserAvg(int comments, int users) {
        if (comments == 0 || users == 0){
            this.commentsUserAvg = 0;
        } else this.commentsUserAvg = (double)comments / (double)users;
    }

    public double getCommentsPostAvg() {
        return commentsPostAvg;
    }

    public void setCommentsPostAvg(int comments, int posts) {
        if (comments == 0 || posts == 0){
            this.commentsPostAvg = 0;
        } else this.commentsPostAvg = (double)comments / (double)posts;
    }
}
