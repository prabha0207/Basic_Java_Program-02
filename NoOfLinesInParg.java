import java.util.Scanner;
import java.io.*;
public class NoOfLinesInParg
{
	public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		String[] s1=s.split("\\.");
		System.out.println(s1.length+"er");
		if(s1.length==1)
    {
			System.out.println(1);
		}
    else
    {
		  int n=s1.length-1;
		  System.out.println(n);
	  }
	}

}
