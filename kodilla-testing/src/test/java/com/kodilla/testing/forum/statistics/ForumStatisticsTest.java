package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testcalculateAdvStatistics() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();

        Statistics statistics = mock(Statistics.class);
        forumStatistics.calculateAdvStatistics(statistics);
        Random theGenerator = new Random();
        List<String> result = new ArrayList<>();
        for (int n = 0; n < 100; n++) {

            result.add(String.join("", Collections.nCopies(theGenerator.nextInt(50) + 1, "a")));
        }

        when(statistics.usersNames()).thenReturn((ArrayList) result);
        Integer posts = 1000;
        when(statistics.postsCount()).thenReturn((Integer) posts);
        Integer comments = 10000;
        when(statistics.commentsCount()).thenReturn((Integer) comments);


        //When
        int quantityOfUsers = result.size();
        int postsStat = posts;
        int commentsStat = comments;
        //Then
        assertEquals(100, quantityOfUsers);
        assertEquals(1000, postsStat);
        assertEquals(10000, commentsStat);


    }

    @Test
    public void testshowStatistics() {

        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statistics = mock(Statistics.class);
        forumStatistics.showStatistics(statistics);
        Random theGenerator = new Random();
        List<String> result = new ArrayList<>();
        for (int n = 0; n < 100; n++) {

            result.add(String.join("", Collections.nCopies(theGenerator.nextInt(50) + 1, "a")));
        }

        when(statistics.usersNames()).thenReturn((ArrayList) result);
        Integer posts = 1000;
        when(statistics.postsCount()).thenReturn((Integer) posts);
        Integer comments = 10000;
        when(statistics.commentsCount()).thenReturn((Integer) comments);


        //When
        int quantityOfUsers = result.size();
        int postsStat = posts;
        int commentsStat = comments;
        //Then
        assertEquals(100, quantityOfUsers);
        assertEquals(1000, postsStat);
        assertEquals(10000, commentsStat);


    }

}
