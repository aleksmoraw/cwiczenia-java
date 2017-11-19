package point;

public class PointApplication {

    public static void main(String[] args) {

        PointController pointController = new PointController();
        Point point = new Point(10,20);
        pointController.addX(point);

        System.out.println("Współrzędne po zmianie: " + point.getX() + " " + point.getY());
    }



}
