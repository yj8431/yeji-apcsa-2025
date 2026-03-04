package polygon;
import java.awt.geom.*; // for Point2D.Double


public class Main {
    public static void main(String [] args)
    {
        IrregularPolygon myPolygon = new IrregularPolygon();
        //testing points for drawing a square
        myPolygon.add(new Point2D.Double(0,0));
        myPolygon.add(new Point2D.Double(0,100));
        myPolygon.add(new Point2D.Double(100,100));
        myPolygon.add(new Point2D.Double(100,0));
        
        myPolygon.draw();

        TestSuite.run();
    }
    
}
