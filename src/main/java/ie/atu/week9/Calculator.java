package ie.atu.week9;

public class Calculator
{
    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("This value is too big");
        }
        return(int) result;
    }

    public int subtract(int firstNum, int secondNum)
    {
        long result = (long) firstNum - secondNum;
        if(result < Integer.MIN_VALUE)
        {
            throw new IllegalArgumentException("This value is too small");
        }
        return(int) result;
    }
}