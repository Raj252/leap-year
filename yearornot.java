import java.io.*;
import java.util.*;
class yearornot
{
	public static void main(String args[])
	{
		int year;
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
