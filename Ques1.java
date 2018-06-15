import java.util.InputMismatchException;
import java.io.IOException;
import java.util.*;
import java.io.FileReader;
import java.io.File;

class Files
{

	public static void main(String args []) throws IOException 
	{
		int a;
		FileReader b = null;
		File f=new File("E:\\Assignment 3\\abc.txt");
		
		try
		{
			b=new FileReader(f);
			while((a=b.read()) >= 0) 
			{
			   System.out.print((char)a);
			}
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Incorrect");
		}
		finally
		{
		   if(b != null)
		   b.close();
		}
	}
}
