import java.io.*;
import java.util.*; 
class number
{
    public static void main(String []s)
    {
        int num;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Input:\n");
        num=sc.nextInt();         
        if(num>0)
        {
            System.out.println("Output:"+"\nPositive");
        }
        else if(num<0)
        {
            System.out.println("Output:"+"\nnegative");
        }
        else
        {
            System.out.println("Output:"+"\nZero");
        }        
    }
}
