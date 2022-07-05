public class ts
{
public static int[] tS(int[] a,int t)
{
for (int i=0;i<a.length-1;i++)
for (int j=i+1;j<a.length;j++)
{
if(a[i]+a[j]==t)
return new int[]{i+1,j+1};
}
return new int[]{-1,-1};
}
public static void main(String args[])
{
int[] a={1,4,5,11,12};
int t=6;
for(int x:tS(a,t))
System.out.println(x+"");
}
} 
