package com.point;

import org.junit.Test;
import point.Point;
import point.PointController;

import static org.junit.Assert.assertTrue;

public class PointControllerTest {

    PointController pointController = new PointController();

    @Test
    public void isAddXisCorrect () {
        Point point = new Point(20, 50);
        Integer sut = pointController.addX(point).getX();
        assertTrue(sut.equals(21));
    }

    @Test
    public void isMinusXisCorrect () {
        Point point = new Point(20, 50);
        Integer sut = pointController.minusX(point).getX();
        assertTrue(sut.equals(19));
    }

    @Test
    public void isAddYisCorrect () {
        Point point = new Point(20, 50);
        Integer sut = pointController.addY(point).getY();
        assertTrue(sut.equals(51));
    }

    @Test
    public void isMinusYisCorrect () {
        Point point = new Point(20, 50);
        Integer sut = pointController.minusY(point).getY();
        assertTrue(sut.equals(49));
    }

}
