package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int steps = 0;
        for (int i=1; i<input.length; i++)
        {
            int current = input[i];
            int a = i-1;
            while (a>=0 && input[a] > current)
            {
                steps++;
                input[a+1] = input[a];
                steps++;
                a--;
            }
            input[a+1] = current;
            steps++;
        }
        System.out.println("Insertion sort steps: " + steps);

    }
}
