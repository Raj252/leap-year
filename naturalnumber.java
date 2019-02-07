import java.io.*;
import java.util.*;
class naturalnumber
{
	public static void main(String args[])
	{
		int i,num,count=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=0;i<=num;i++)
		{
			count+=i;
		}
		System.out.println(count);
	}
}
