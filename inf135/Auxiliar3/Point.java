
/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point
{
    int x;
    int y;
    
    Point() {
        x = 0;
        y = 0;
    }
    
    Point(int a, int b) {
        x = a;
        y = b;
    }
    
    double distance(Point otro) {
        double dx, dy, suma, distance;
        dx = this.x - otro.x;
        dy = this.y - otro.y;
        suma = dx*dx + Math.pow(dy, 2);
        distance = Math.sqrt(suma);
        return distance;
    }
    
    String asString() {
        String res = "("+x+","+y+")";
        return res;
    }
    
    void moveHorizontalBy(int dx) {
        x = x + dx;
    }
}
