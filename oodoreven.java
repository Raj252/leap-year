import java.io.*;
import java.util.Scanner; 
class oodoreven
{
   public static void main(String args[])
   {
		int x;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if(x>0)
		{
			if (x % 2 == 0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
			}
		else
		{
			System.out.println("Invalid");
		}
   }
}
