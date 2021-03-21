package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    private Statistics statistics;

    private List<String> generateUsernames(int number) {
        List<String> userNames = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String userName = "User " + i;
            userNames.add(userName);
        }
        return userNames;
    }

    private void mockStatistics(int nUsers, int nPosts, int nComments) {
        when(statistics.usersNames()).thenReturn(generateUsernames(nUsers));
        when(statistics.postsCount()).thenReturn(nPosts);
        when(statistics.commentsCount()).thenReturn(nComments);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestsForPosts {
        @Test
        public void testIfPosts0() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(2, 0, 0);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculator.getAvgCommentsPerPost(), 0.1);
            assertEquals(0, statisticsCalculator.getAvgPostsPerUser(), 0.1);
        }

        @Test
        public void testIfPosts1000() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(250, 1000, 5000);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(5, statisticsCalculator.getAvgCommentsPerPost(), 0.1);
            assertEquals(4, statisticsCalculator.getAvgPostsPerUser(), 0.1);
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestsForComments {
        @Test
        public void testIfComments0() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(4, 10, 0);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculator.getAvgCommentsPerPost(), 0.1);
            assertEquals(0, statisticsCalculator.getAvgCommentsPerUser(), 0.1);
        }

        @Test
        public void testIfCommentsLessThanPosts() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(4, 10, 5);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0.5, statisticsCalculator.getAvgCommentsPerPost(), 0.1);
            assertEquals(1.25, statisticsCalculator.getAvgCommentsPerUser(), 0.01);
        }

        @Test
        public void testIfCommentsMoreThanPosts() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(4, 10, 15);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(1.5, statisticsCalculator.getAvgCommentsPerPost(), 0.1);
            assertEquals(3.75, statisticsCalculator.getAvgCommentsPerUser(), 0.01);
        }
    }

    @Nested
    @DisplayName("Tests for users")
    class TestsForUsers {
        @Test
        public void testIfUsers0() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(0, 0, 0);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(0, statisticsCalculator.getAvgPostsPerUser(), 0.1);
            assertEquals(0, statisticsCalculator.getAvgCommentsPerUser(), 0.01);
        }

        @Test
        public void testIfUsers100() {
            //Given
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            mockStatistics(100, 500, 2000);
            statisticsCalculator.calculateAdvStatistics(statistics);

            //When
            //Then
            assertEquals(5, statisticsCalculator.getAvgPostsPerUser(), 0.1);
            assertEquals(20, statisticsCalculator.getAvgCommentsPerUser(), 0.01);
        }
    }
}
