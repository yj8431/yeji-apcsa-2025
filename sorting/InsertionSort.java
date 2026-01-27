package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int[] newList = new int[input.length];
        for (int i=0; i<input.length; i++)
        {
            if (input[i]<input[i+1])
            {
                newList[i] = input[i];
            }
            else
            {
                //compare with previous terms
                for (int a=i+1; a>0; a--)
                {
                    if (input[a])
                }
            }
        }

    }
}
