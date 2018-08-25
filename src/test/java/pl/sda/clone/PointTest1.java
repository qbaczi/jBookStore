package pl.sda.clone;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PointTest1 {

    @Test
    void pointTest(){
        Point point1 = new Point(3, 3);
        Point point2 = new Point(3, 3);
        Point copyPoint = new Point(point1);
        Point fakeCopyPoint = point1;

//        assertEquals(point1,point2);
//        assertTrue(point1.equals(point2));
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);

//        point1.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point1,fakeCopyPoint);
//        assertEquals(point2,copyPoint);

//        point2.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);

//        copyPoint.setX(5);
//        assertEquals(point1,point2);
//        assertEquals(point1,copyPoint);
//        assertEquals(point2,copyPoint);
    }

    @Test
    void segmentTest(){
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 3);
        Segment segment1 = new Segment(startPoint, endPoint);
        Segment segment2 = new Segment(startPoint, endPoint);
        Segment copySegment = segment1;

        assertEquals(segment1,segment2);
        assertEquals(segment1,copySegment);
        assertEquals(segment2,copySegment);

        segment1.getStartPoint().setX(5);
        assertEquals(segment1,segment2);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment2,copySegment);
//
//        segment2.getStartPoint().setX(5);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment1,segment2);
//        assertEquals(segment2,copySegment);
//
//        copySegment.getStartPoint().setX(5);
//        assertEquals(segment1,segment2);
//        assertEquals(segment1,copySegment);
//        assertEquals(segment2,copySegment);
    }
}