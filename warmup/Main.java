package warmup;

public class Main {
    //problem 1: find the sum of all the multiplies of 3 or 5 below 1000

    public static void main(String[] args) {
        // Your code here.
        int sum = 0;
        for (int i=1; i<1000; i++)
        {
            if (i%3==0 || i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
