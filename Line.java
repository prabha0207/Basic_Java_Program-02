import java.util.*;
import java.lang.*;
public class Line
{
public static void main(String args[])
{
String a;
int count=0;
Scanner s=new Scanner(System.in);
a=s.nextLine();
String b[]=a.split("\\.");
for(int i=0;i<b.length;i++){
count++;
}
System.out.println(count);
}
