import java.util.Scanner;
import java.lang.Math;
public class sumOfCubes
{
    public static void main(String[] args)
    {
        double num;
        double total = 0;
        double pow = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        while(num > 0)
        {
            double digit = num % (Math.pow(10,pow));
            total = total + Math.pow(digit / (Math.pow(10, pow-1)),3);
            System.out.println("Digit " + digit / (Math.pow(10, pow-1)));
            System.out.println("Change " + total);
            pow++;
            num = num - digit;
        }
        System.out.println(total);
    }
}