package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i=1; i<input.length; i++)
        {
            int current = input[i];
            int a = i-1;
            while (a>=0 && input[a] > current)
            {
                input[a+1] = input[a];
                a--;
            }
            input[a+1] = current;
        }

    }
}
