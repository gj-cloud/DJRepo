import java.util.*;
class Snumber {
    public int singleNumber(int[] nums) {
       int l=nums.length;
boolean isTwice=false;
for(int i=0;i<l;i++)
{
isTwice=false;
for(int j=0;j<l;j++)
{

if(isTwice)
break;
if(i!=j)
if(nums[i]==nums[j])
isTwice=true;
}
if(!isTwice) return nums[i];
}
return nums[l-1];
   }
}