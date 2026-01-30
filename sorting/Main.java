package sorting;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.

        for (int size=100; size<=800; size*=2)
        {
            System.out.println("Size " + size);
            int[] testInput = randomArray(size);
            TestSuite.run(testInput, 1);
        }

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        
    }

    public static int[] randomArray(int length)
    {
        // TODO: make this return an actual random array of the provided length.
        //int[] a = {10, 5, 3, 2};
        int[] a = new int[length];
        for (int i=0; i<length; i++)
        {
            a[i] = (int) (Math.random()*100);
        }
        return a;
    }

}
