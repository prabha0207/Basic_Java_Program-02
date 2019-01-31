import java.io.*;
import java.util.*;
public class CountNoWord
{
      public static void main(String args[])
      {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter your String");
        String input=sc.nextLine();
        int c=0;
          for(int i=0;i<input.length()-1;i++)
          {
            if(input.charAt(i)==' ')
            {
              c++;
            }
            
          } 
          System.out.println("Space Count="+c)
       }
}
