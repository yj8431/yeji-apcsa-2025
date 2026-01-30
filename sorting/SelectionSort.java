package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        int smallest;
        int smallestPosition;
        int steps = 0;
        for (int i=0; i<input.length; i++)
        {
            smallest = input[i];
            smallestPosition = i;
            for (int a=i; a<input.length; a++)
            {
                steps++;
                if (input[a]<smallest)
                {
                    smallest = input[a];
                    smallestPosition = a;
                }
            }
            steps+=3;
            int temp = input[i];
            input[i] = smallest;
            input[smallestPosition] = temp;
        }
        System.out.println("Selection sort steps: " + steps);
    }
    
}
