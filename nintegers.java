import java.io.*;
import java.util.*;
class nintegers
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int sum=0;
		int a[]=new int[N];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);		
	}
}
