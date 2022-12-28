import java.io.*;
import java.io.FileWriter;
import java.sql.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Main {
    public static void main(String[] args)
    {
        int opcion = 0;
        do{
            Scanner leer = new Scanner(System.in);
            System.out.println("PROGRAM: ");
            System.out.println("1. Find the second largest number in an array.");
            System.out.println("2. Print the Fibonacci series of a given integer number.");
            System.out.println("3. Explain polymorphism, overloading and overriding.");
            System.out.println("4. EXIT");
            System.out.println("Choose an option (1-5)");
            opcion = leer.nextInt();
            if ((opcion>4) || (opcion <1))
            {
                System.out.println("Incorrect");
            }
            else if (opcion == 1)
            {
                int array[]= {1,7,89,34,4};
                System.out.println("1) The second largest number in an array is: " + secondLargestNumber(array));

            }
            else if (opcion == 2)
            {
                int numberFib = 0;
                Scanner numb = new Scanner(System.in);
                System.out.println("Enter your integer number: ");
                numberFib = numb.nextInt();
                System.out.println("The Fibonacci series of the integer " + numberFib + " is: " + Fibonacci(numberFib));
            }
            else if (opcion == 3)
            {
                // Polymorphism:

                // 1) Overriding
                System.out.println("OVERRIDING");
                // create 3 different device objects
                devices device_0 = new devices();
                devices device_1 = new smartphone();
                devices device_2 = new pc();
                // we use the same function in both devices but answer is different depending on the device we are calling
                System.out.println("Device 0: ");
                device_0.batteryAlert(17);
                System.out.println("Device 1: ");
                device_1.batteryAlert(17);
                System.out.println("Device 2: ");
                device_2.batteryAlert(17);

                // 2) Overloading:
                System.out.println("OVERLOADING");
                overloadingExample example = new overloadingExample();
                // It´s the same function but which one is used depends on the inputs
                int in1 = 2, in2 = 7, in3= 9;
                double fl1 = 2.8, fl2 = 7.3;
                System.out.println("Primera suma, example.add(in1,in2): " + example.add(in1,in2) );
                System.out.println("Segunda suma, example.add(in1,in2,in3): " + example.add(in1,in2,in3) );
                System.out.println("Tercera suma, example.add(fl1,fl2): " + example.add(fl1,fl2) );
            }
        }while(opcion!=4);
    }
    public static int secondLargestNumber(int[] numberArray)
    {
        // Code receive an array
        int maxNumber = 0; // initialize maxNumber to save the largest number in the array
        int secondMax = 0; // initialize secondMax to save the second largest number in the array
        int auxNumber = 0; // create an auxiliary int
        for (int i = 0; i < numberArray.length; i++)
        {
            auxNumber = numberArray[i];
            // if the number in the array is bigger than auxNumber & smaller than maxNumber...
            if ((auxNumber >= secondMax) && (auxNumber < maxNumber))
            {
                secondMax = auxNumber; // store auxNumber into secondMax
            }
            // if the number in the array is bigger than maxNumber...
            else if(auxNumber>maxNumber)
            {
                secondMax = maxNumber; // store maxNumber into secondMax
                maxNumber = auxNumber; // store auxNumber into maxNumber
            }
        }
        return secondMax; // return the second largest number
    }
    public static int Fibonacci(int n)
    {

        // if n=0 or n<0 then return 0 (always the same)
        if (n <= 0) {
            return 0;
        // if n=1 then return 1 (always the same)
        } else if (n == 1) {
            return 1;
        } else {
        // if n>1 we use this recursive function to call & add the previous two numbers in the Fibonacci sequence
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}

