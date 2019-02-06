import java.io.*;
import java.util.Scanner; 
class charcount 
{

    public static void main(String[] args) 
	{
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		
        char ch;
        Scanner s= new Scanner(System.in);
        ch = s.next().charAt(0);
		
	
            if((ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')||(ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U')) 
			{
                ++vowels;
				System.out.println("Vowel");
            }
            else if((ch >= 'a'&& ch <= 'z')||(ch >= 'A'&& ch <= 'Z')) 
			{
				++consonants;
				System.out.println("Consonant");
            }
			else
			{
				System.out.println("Invalid");
			}
    }
}
