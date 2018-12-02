import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4, 13);

        PointSetter.show(location,"Poożenie początkowe: ");
        PointSetter.changePoint(location, 7, 6,"\nPrzjście do (7,6)\n");
        PointSetter.show(location, "Poożenie końcowe: ");

    }

    static void show(Point point){
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void show(Point point, String opis){
        System.out.println(opis);
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void changePoint(Point point, int x, int y, String desc){
        System.out.println(desc);
        point.x = x;
        point.y = y;
    }

}
