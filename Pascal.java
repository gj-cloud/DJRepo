import java.util.*;

class Pascal{
	public List<List<Integer>> generate(int numRows)
	{
	   List<List<Integer>> res=new ArrayList();
	   if(numRows<1)
return res;
List<Integer> c=new ArrayList();
c.add(1);
res.add(c);
for(int i=1;i<numRows;i++)
{
	List<Integer> tR=new ArrayList();
List<Integer> prev=res.get(i-1);
for(int j=0;j<=i;j++)
{
int tmp=(j>0?prev.get(j-1):0)+(j<i?prev.get(j):0);
tR.add(tmp);
}
res.add(tR);
}
return res;	
}
}
