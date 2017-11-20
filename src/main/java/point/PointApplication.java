package point;

public class PointApplication {

    public static final int ADD_X = 0;
    public static final int ADD_Y = 1;
    public static final int MINUS_X = 2;
    public static final int MINUS_Y = 3;

    public static void main(String[] args) {

        PointController pointController = new PointController();
        Point point = new Point(10,20);

        int option = ADD_X;

        switch (option) {
            case ADD_X:
                pointController.addX(point);
                break;
            case ADD_Y:
                pointController.addY(point);
                break;
            case MINUS_X:
                pointController.minusX(point);
                break;
            case MINUS_Y:
                pointController.minusY(point);
                break;
            default:
                System.out.println("Podano błędność wartość.");
        }

        System.out.println("Współrzędne po zmianie: " + point.getX() + " " + point.getY());
    }



}
