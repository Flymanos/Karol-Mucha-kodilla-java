package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    static int counter = 1;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("StatisticsCalculator Test Suite starts!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("StatisticsCalculator Test Suite ends!");
    }

    @Before
    public void before(){
        System.out.println("Test case nr " + counter + " starts.");
    }

    @After
    public void after(){
        System.out.println("Test case nr " + counter + " ends.");
        counter++;
    }

    @Test
    public void postsUserAvg0PostsTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> list = new ArrayList<>();
        list.add("Grzegorz");
        list.add("Marcel");
        //when
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(list);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getPostsUserAvg();
        //then
        Assert.assertEquals(0, result, 0);
    }

    @Test
    public void postsUserAvg1000PostsTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> list = new ArrayList<>();
        list.add("Grzegorz");
        list.add("Marcel");
        //when
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(list);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getPostsUserAvg();
        //then
        Assert.assertEquals(500, result, 0);
    }

    @Test
    public void commentsPostAvg0PostsTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //when
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getCommentsPostAvg();
        //then
        Assert.assertEquals(0, result, 0);
    }

    @Test
    public void commentsPostAvgMorePostsTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //when
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getCommentsPostAvg();
        //then
        Assert.assertEquals(0.5, result, 0);
    }

    @Test
    public void commentsPostAvgLessPostsTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //when
        when(statistics.postsCount()).thenReturn(500);
        when(statistics.commentsCount()).thenReturn(1000);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getCommentsPostAvg();
        //then
        Assert.assertEquals(2, result, 0);
    }

    @Test
    public void usersPostAvg100UsersTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(".");
        }
        //when
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(list);
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getPostsUserAvg();
        //then
        Assert.assertEquals(1, result, 0);
    }

    @Test
    public void usersPostAvg0UsersTestCase(){
        //given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //when
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(new ArrayList<String>());
        statisticsCalculator.calculateAdvStatistics(statistics);
        double result = statisticsCalculator.getPostsUserAvg();
        //then
        Assert.assertEquals(0, result, 0);
    }
}
