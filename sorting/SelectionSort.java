package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        int smallest=input[0];
        int smallestPosition = 0;
        for (int i=0; i<input.length; i++)
        {
            for (int a=i; a<input.length; a++)
            {
                if (input[a]<smallest)
                {
                    smallest = input[a];
                    smallestPosition = a;
                }
            }
            int temp = input[i];
            input[i] = smallest;
            input[smallestPosition] = temp;
            

        }
        //System.out.println(input);
    }
    
}
