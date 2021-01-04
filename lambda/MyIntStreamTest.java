package lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Arrays.asList;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();

    @Test // 1
    public void rangeTest() {
        assertTrue(asList(1, 2, 3, 4).equals(le.rangeTest(1, 5)));
    }

    @Test // 2
    public void allMatchEvenTest() {
        assertTrue(le.allMatchEvenTest(2));
    }

    @Test // 3
    public void ofBoxTest() {
        assertTrue(asList(1, 2, 3, 4).equals(le.ofBoxTest()));
    }

    @Test // 4
    public void concatTest() {
        assertTrue(asList(1, 2, 3).equals(le.concatTest()));
    }

    @Test // 5
    public void collectTest() {
        assertTrue(asList(2, 4, 6, 8, 10).equals(le.collectTest()));
    }

    @Test // 6
    public void averageTest() {
        assertEquals(3.0, le.averageTest(1, 6));
    }

    @Test // 7
    public void builderTest() {
        assertTrue(asList(1, 2, 3).equals(le.builderTest()));
    }

    @Test // 8
    public void summaryStatisticsTest() {
        /*
         * IntSummaryStatistics stats = summaryStatisticsTest(1, 5, 100,
         * 105).mapToInt(toInt).sorted().skip(i) .summaryStatistics();
         * 
         * assertEquals(9, stats.getCount()); assertEquals(520, stats.getSum());
         * assertEquals(1, stats.getMin()); assertEquals(57.777778, stats.getAverage());
         * assertEquals(104, states.getMax());
         */
    }

    @Test // 9
    public void countTest() {
        assertEquals(100, le.countTest(0, 100));
    }

    @Test // 10
    public void distinctTest() {
        assertTrue(asList(4, 3, 5, 2, 7).equals(le.distinctTest()));
    }

    @Test // 11
    public void emptyTest() {
        assertEquals(0, le.emptyTest());
    }

    @Test // 12
    public void findFirstTest() {
        assertEquals(1, le.findFirstTest());
    }

    @Test // 13
    public void flatMapTest() {
        assertTrue(asList(2, 4, 6, 8, 10).equals(le.flatMapTest()));
    }

    @Test // 14
    public void generateTest() {
        assertTrue(asList(15, 80, 29, 36, 22).equals(le.generateTest()));
    }

    @Test // 15
    public void iterateTest() {
        assertTrue(asList(10, 15, 20, 25, 30).equals(le.iterateTest()));
    }

    @Test // 16
    public void mapTest() {
        assertTrue(asList(2, 4, 6, 8).equals(le.mapTest(1, 5)));
    }

    @Test // 17
    public void maxTest() {
        assertEquals(4, le.maxTest());
    }

    @Test // 18
    public void peekTest() {
        assertFalse(le.peekTest());
    }

    @Test // 19
    public void rangeClosedTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.rangeClosedTest()));
    }

    @Test // 20
    public void reduceTest() {
        assertEquals(55, le.reduceTest(1, 10));
    }

    @Test // 21
    public void sequentialTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sequentialTest()));
    }

    @Test // 22
    public void parallelTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.parallelTest()));
    }

    @Test // 23
    public void skipTest() {
        assertTrue(asList(4, 5).equals(le.skipTest()));
    }

    @Test // 24
    public void sortTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sortTest()));
    }

}