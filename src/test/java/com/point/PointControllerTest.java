package com.point;

import org.junit.Test;
import point.Point;
import point.PointController;

import static org.junit.Assert.assertTrue;

public class PointControllerTest {

    PointController pointController = new PointController();
    private Point point = new Point(20, 50);

    @Test
    public void isAddXisCorrect () {
        Integer sut = pointController.addX(point).getX();
        assertTrue(sut.equals(21));
    }

    @Test
    public void isMinusXisCorrect () {
        Integer sut = pointController.minusX(point).getX();
        assertTrue(sut.equals(19));
    }

    @Test
    public void isAddYisCorrect () {
        Integer sut = pointController.addY(point).getY();
        assertTrue(sut.equals(51));
    }

    @Test
    public void isMinusYisCorrect () {
        Integer sut = pointController.minusY(point).getY();
        assertTrue(sut.equals(49));
    }

}
