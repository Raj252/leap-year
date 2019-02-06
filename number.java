import java.io.*;
import java.util.*;
class number
{
    public static void main(String []s)
    {
        int num;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Input:");
        num=sc.nextInt();         
        if(num>0)
        {
            System.out.println("OUTPUT"+"\nPositive");
        }
        else if(num<0)
        {
            System.out.println("OUTPUT"+"\nnegative");
        }
        else
        {
            System.out.println("OUTPUT"+"\nZero");
        }      
    }
}
