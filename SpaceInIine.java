import java.util.Scanner;
import java.io.*;
public class SpaceInIine
{
public static void main(String[] args)
{

    System.out.println("Enter anything you want.");
    String text;
    int let = 0;
    int dig = 0;
    int space= 0;
    Scanner sc = new Scanner(System.in);
    text = sc.next();
    char[]arr=text.toCharArray();
     for(int i=0;i<text.length();i++)
     {
        if (Character.isDigit(arr[i]))
        {
            dig++;
        }
        else if (Character.isLetter(arr[i])) 
        { 
            let++;
        } 
        else if (Character.isWhitespace(arr[i])) 
        {
            space++;
        }
    }
    System.out.println("Number of Letters : "+let);
    System.out.println("Number of Digits : "+dig);
    System.out.println("Number of Whitespaces : "+space);
  }          
}
