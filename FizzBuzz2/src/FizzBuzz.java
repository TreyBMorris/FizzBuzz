public class FizzBuzz 
{
    public static void main (String[] args)
    {
        int numberToReach = 100;

        for (int i = 1; i<=numberToReach; i++)
        {
            System.out.print(i);

            boolean divisbleByThree = i % 3 ==0;
            boolean divisbleByFive = i % 5 ==0;



            if (divisbleByThree)
            {
                System.out.print(" Fizz");
            }

            if (divisbleByFive)
            {
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}
