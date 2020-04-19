package com.kodilla.testing.forum.statistics;


import java.util.ArrayList;

public class ForumStatistics {
    Integer userNumber;
    Double postsNumber;
    Double commentsNumber;
    Double averagePosts;
    Double averageComments;
    Double averageCommentsPosts;

    public void calculateAdvStatistics(Statistics statistics) {

        ArrayList<String> userList = new ArrayList<>();
        for (String name : statistics.usersNames()) {
            userList.add(name);
        }
        userNumber = userList.size();
        postsNumber = (double) statistics.postsCount();
        commentsNumber = (double) statistics.commentsCount();
        averagePosts = (postsNumber / userNumber);
        averageComments = (commentsNumber / userNumber);
        averageCommentsPosts = (commentsNumber / postsNumber);
        System.out.println(" Numbers of users = " + userNumber + " Numbers of posts = " + postsNumber + " Numbers of comments = " + commentsNumber + " Average of posts = " + averagePosts + " Average of comments = " + averageComments + " Average comments/posts = " + averageCommentsPosts);

    }

    public void showStatistics(Statistics statistics) {
        System.out.println(" Numbers of users = " + userNumber + " Numbers of posts = " + postsNumber + " Numbers of comments = " + commentsNumber + " Average of posts = " + averagePosts + " Average of comments = " + averageComments + " Average comments/posts = " + averageCommentsPosts);
    }

}
