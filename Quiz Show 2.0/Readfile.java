import java.io.*;
import java.util.*;
class Readfile
{
	Scanner x;
	void openFile(String s)
	{
		try
		{
			x = new Scanner(new File(s));
		}
		catch (Exception e)
		{
			System.out.println("Could not find file");
		}
	}
	String [] readFile()
	{
		int i = 0;
		String[] a = new String[125];
		while(x.hasNext())
		{
			a[i++] = x.nextLine();
		}
		return a;
	}
	void closeFile()
	{
		x.close();
	}
}