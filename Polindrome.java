import java.util.*;
import java.io.*;
class Polindrome {
 public static void main(String args[])
    {
String x,y="";
System.out.println("Enter a String:");
Scanner a=new Scanner(System.in);
//String a =sc.nextLine();
 x=a.nextLine();

int l=x.length();
for(int k=l-1;k>=0;k--)
{
y=y+x.charAt(k);
}
if(x.equalsIgnoreCase(y))
{
System.out.println("true");
System.out.print(y);
System.out.println("  is a palindrome");
}
else{

System.out.println("false");
System.out.print(y);
System.out.println("  is not a palindrome");
}
}
}