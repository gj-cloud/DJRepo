import java.util.*;
class Solution {
    public static int reverse(int x) {
        int rem,rev=0;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
           }
        return rev;               
    }
public static void main(String args[])
{
    System.out.println("Enter x value");
    Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
if (x>0)
{
 int result=reverse(x);    
    System.out.println("the reverse number is"+result);
}
else
{
int result=reverse(-x);
System.out.println("the reverse number is"+(-result));
    }          
}
}

