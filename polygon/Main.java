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
        

        //test point parallelogram draw
        /*
        double[][] parallelogramPoints = {{20,10},{70,20},{50,50},{0,40}};
        for (double[] p : parallelogramPoints)
        {
            Point2D.Double point = new Point2D.Double(p[0],p[1]);
            myPolygon.add(point);
        }
        */
        
        //myPolygon.draw();

        TestSuite.run();
    }
    
}
