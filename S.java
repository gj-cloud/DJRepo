public class S
{
public int[] twoSum(int[] n,int t)
{
int l=n.length;
int[] r=new int[2];
int n1=0;
int sum=0;
for (int i=0;i<l;i++)
{
n1=n[i];
for (int j=0;j<l;j++)
{
sum=n1+n[i];
if(sum==t)
{
r[0]=i;
r[1]=j;
}
}
}
return r;
}
}
