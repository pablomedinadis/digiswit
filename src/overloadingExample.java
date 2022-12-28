public class overloadingExample {
    public int add(int firstNum,int secondNum)
    {
        return firstNum + secondNum;
    }
    public int add(int firstNum,int secondNum, int thirdNum)
    {
        return firstNum + secondNum + thirdNum;
    }
    public double add(double firstNum, double secondNum)
    {
        return firstNum + secondNum;
    }
}
