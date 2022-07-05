import java.util.*;
class Solution2 {
    public static int reverse(int x) 
{
int rem,rev=0;
if (x>0)
{        
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
           }
        return rev;               
    }
else
{
x=-x;
  while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
           }
        return -rev;

}
}

public static void main(String args[])
{
    System.out.println("Enter x value");
    Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

 int result=reverse(x);    
    System.out.println("the reverse number is"+result);
        
}
}

